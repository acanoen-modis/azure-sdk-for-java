// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An error response from the Compute service. */
@Immutable
public final class ApiError extends ManagementError {
    /*
     * The Api inner error
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private InnerError innererror;

    /**
     * Get the innererror property: The Api inner error.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getInnererror() != null) {
            getInnererror().validate();
        }
    }
}
