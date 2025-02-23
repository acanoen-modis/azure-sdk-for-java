// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a short term retention policy. */
@Fluent
public final class ManagedBackupShortTermRetentionPolicyProperties {
    /*
     * The backup retention period in days. This is how many days Point-in-Time
     * Restore will be supported.
     */
    @JsonProperty(value = "retentionDays")
    private Integer retentionDays;

    /**
     * Get the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     *
     * @return the retentionDays value.
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays property: The backup retention period in days. This is how many days Point-in-Time Restore
     * will be supported.
     *
     * @param retentionDays the retentionDays value to set.
     * @return the ManagedBackupShortTermRetentionPolicyProperties object itself.
     */
    public ManagedBackupShortTermRetentionPolicyProperties withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
