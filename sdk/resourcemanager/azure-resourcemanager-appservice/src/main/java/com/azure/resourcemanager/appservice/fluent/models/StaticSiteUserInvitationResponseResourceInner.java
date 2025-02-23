// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Static sites user roles invitation link resource. */
@Fluent
public final class StaticSiteUserInvitationResponseResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteUserInvitationResponseResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteUserInvitationResponseResourceProperties innerProperties;

    /**
     * Get the innerProperties property: StaticSiteUserInvitationResponseResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSiteUserInvitationResponseResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteUserInvitationResponseResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the expiresOn property: The expiration time of the invitation.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime expiresOn() {
        return this.innerProperties() == null ? null : this.innerProperties().expiresOn();
    }

    /**
     * Get the invitationUrl property: The url for the invitation link.
     *
     * @return the invitationUrl value.
     */
    public String invitationUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().invitationUrl();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
