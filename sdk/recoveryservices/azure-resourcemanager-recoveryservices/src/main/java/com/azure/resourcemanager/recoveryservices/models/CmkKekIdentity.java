// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details of the identity used for CMK. */
@Fluent
public class CmkKekIdentity {
    /*
     * Indicate that system assigned identity should be used. Mutually
     * exclusive with 'userAssignedIdentity' field
     */
    @JsonProperty(value = "useSystemAssignedIdentity")
    private Boolean useSystemAssignedIdentity;

    /*
     * The user assigned identity to be used to grant permissions in case the
     * type of identity used is UserAssigned
     */
    @JsonProperty(value = "userAssignedIdentity")
    private String userAssignedIdentity;

    /**
     * Get the useSystemAssignedIdentity property: Indicate that system assigned identity should be used. Mutually
     * exclusive with 'userAssignedIdentity' field.
     *
     * @return the useSystemAssignedIdentity value.
     */
    public Boolean useSystemAssignedIdentity() {
        return this.useSystemAssignedIdentity;
    }

    /**
     * Set the useSystemAssignedIdentity property: Indicate that system assigned identity should be used. Mutually
     * exclusive with 'userAssignedIdentity' field.
     *
     * @param useSystemAssignedIdentity the useSystemAssignedIdentity value to set.
     * @return the CmkKekIdentity object itself.
     */
    public CmkKekIdentity withUseSystemAssignedIdentity(Boolean useSystemAssignedIdentity) {
        this.useSystemAssignedIdentity = useSystemAssignedIdentity;
        return this;
    }

    /**
     * Get the userAssignedIdentity property: The user assigned identity to be used to grant permissions in case the
     * type of identity used is UserAssigned.
     *
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The user assigned identity to be used to grant permissions in case the
     * type of identity used is UserAssigned.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the CmkKekIdentity object itself.
     */
    public CmkKekIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
