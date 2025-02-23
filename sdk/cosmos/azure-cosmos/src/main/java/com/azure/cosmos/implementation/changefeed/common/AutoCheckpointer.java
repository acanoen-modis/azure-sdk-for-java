// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed.common;

import com.azure.cosmos.implementation.changefeed.ChangeFeedObserver;
import com.azure.cosmos.implementation.changefeed.ChangeFeedObserverCloseReason;
import com.azure.cosmos.implementation.changefeed.ChangeFeedObserverContext;
import com.azure.cosmos.implementation.changefeed.CheckpointFrequency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * Auto check-pointer implementation for {@link ChangeFeedObserver}.
 */
public class AutoCheckpointer<T> implements ChangeFeedObserver<T> {
    private final Logger logger = LoggerFactory.getLogger(AutoCheckpointer.class);
    private final CheckpointFrequency checkpointFrequency;
    private final ChangeFeedObserver<T> observer;
    private volatile int processedDocCount;
    private volatile Instant lastCheckpointTime;

    public AutoCheckpointer(CheckpointFrequency checkpointFrequency, ChangeFeedObserver<T> observer) {
        if (checkpointFrequency == null) {
            throw new IllegalArgumentException("checkpointFrequency");
        }

        if (observer == null) {
            throw new IllegalArgumentException("observer");
        }

        this.checkpointFrequency = checkpointFrequency;
        this.observer = observer;
        this.lastCheckpointTime = Instant.now();
    }

    @Override
    public void open(ChangeFeedObserverContext<T> context) {
        this.observer.open(context);
    }

    @Override
    public void close(ChangeFeedObserverContext<T> context, ChangeFeedObserverCloseReason reason) {
        this.observer.close(context, reason);
    }

    @Override
    public Mono<Void> processChanges(ChangeFeedObserverContext<T> context, List<T> docs) {
        return this.observer.processChanges(context, docs)
            .doOnError(throwable -> {
                logger.warn("Unexpected exception from thread {}", Thread.currentThread().getId(), throwable);
            })
            .then(this.afterProcessChanges(context));
    }

    private Mono<Void> afterProcessChanges(ChangeFeedObserverContext<T> context) {
        this.processedDocCount ++;

        if (this.isCheckpointNeeded()) {
            return context.checkpoint()
                .doOnError(throwable -> {
                    logger.warn("Checkpoint failed; this worker will be killed", throwable);
                })
                .doOnSuccess((Void) -> {
                    this.processedDocCount = 0;
                    this.lastCheckpointTime = Instant.now();
                })
                .then();
        }
        return Mono.empty();
    }

    private boolean isCheckpointNeeded() {
        if (this.checkpointFrequency.getProcessedDocumentCount() == 0 && this.checkpointFrequency.getTimeInterval() == null) {
            return true;
        }

        if (this.processedDocCount >= this.checkpointFrequency.getProcessedDocumentCount()) {
            return true;
        }

        Duration delta = Duration.between(this.lastCheckpointTime, Instant.now());

        return delta.compareTo(this.checkpointFrequency.getTimeInterval()) >= 0;
    }
}
