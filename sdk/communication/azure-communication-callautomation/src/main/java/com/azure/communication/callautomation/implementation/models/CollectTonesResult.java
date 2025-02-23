// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CollectTonesResult model. */
@Fluent
public final class CollectTonesResult {
    /*
     * The tones property.
     */
    @JsonProperty(value = "tones")
    private List<String> tones;

    /**
     * Get the tones property: The tones property.
     *
     * @return the tones value.
     */
    public List<String> getTones() {
        return this.tones;
    }

    /**
     * Set the tones property: The tones property.
     *
     * @param tones the tones value to set.
     * @return the CollectTonesResult object itself.
     */
    public CollectTonesResult setTones(List<String> tones) {
        this.tones = tones;
        return this;
    }
}
