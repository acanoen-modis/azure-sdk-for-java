// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RecognizeRequest model. */
@Fluent
public final class RecognizeRequest {
    /*
     * Determines the type of the recognition.
     */
    @JsonProperty(value = "recognizeInputType", required = true)
    private RecognizeInputTypeInternal recognizeInputType;

    /*
     * The source of the audio to be played for recognition.
     */
    @JsonProperty(value = "playPrompt")
    private PlaySourceInternal playPrompt;

    /*
     * If set recognize can barge into other existing
     * queued-up/currently-processing requests.
     */
    @JsonProperty(value = "stopCurrentOperations")
    private Boolean stopCurrentOperations;

    /*
     * Defines options for recognition.
     */
    @JsonProperty(value = "recognizeConfiguration", required = true)
    private RecognizeConfigurationsInternal recognizeConfiguration;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the recognizeInputType property: Determines the type of the recognition.
     *
     * @return the recognizeInputType value.
     */
    public RecognizeInputTypeInternal getRecognizeInputType() {
        return this.recognizeInputType;
    }

    /**
     * Set the recognizeInputType property: Determines the type of the recognition.
     *
     * @param recognizeInputType the recognizeInputType value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeRequest setRecognizeInputType(RecognizeInputTypeInternal recognizeInputType) {
        this.recognizeInputType = recognizeInputType;
        return this;
    }

    /**
     * Get the playPrompt property: The source of the audio to be played for recognition.
     *
     * @return the playPrompt value.
     */
    public PlaySourceInternal getPlayPrompt() {
        return this.playPrompt;
    }

    /**
     * Set the playPrompt property: The source of the audio to be played for recognition.
     *
     * @param playPrompt the playPrompt value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeRequest setPlayPrompt(PlaySourceInternal playPrompt) {
        this.playPrompt = playPrompt;
        return this;
    }

    /**
     * Get the stopCurrentOperations property: If set recognize can barge into other existing
     * queued-up/currently-processing requests.
     *
     * @return the stopCurrentOperations value.
     */
    public Boolean isStopCurrentOperations() {
        return this.stopCurrentOperations;
    }

    /**
     * Set the stopCurrentOperations property: If set recognize can barge into other existing
     * queued-up/currently-processing requests.
     *
     * @param stopCurrentOperations the stopCurrentOperations value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeRequest setStopCurrentOperations(Boolean stopCurrentOperations) {
        this.stopCurrentOperations = stopCurrentOperations;
        return this;
    }

    /**
     * Get the recognizeConfiguration property: Defines options for recognition.
     *
     * @return the recognizeConfiguration value.
     */
    public RecognizeConfigurationsInternal getRecognizeConfiguration() {
        return this.recognizeConfiguration;
    }

    /**
     * Set the recognizeConfiguration property: Defines options for recognition.
     *
     * @param recognizeConfiguration the recognizeConfiguration value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeRequest setRecognizeConfiguration(RecognizeConfigurationsInternal recognizeConfiguration) {
        this.recognizeConfiguration = recognizeConfiguration;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeRequest setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
