// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.AttachedNetworkConnectionInner;
import com.azure.resourcemanager.devcenter.models.AttachedNetworkConnection;
import com.azure.resourcemanager.devcenter.models.DomainJoinType;
import com.azure.resourcemanager.devcenter.models.HealthCheckStatus;

public final class AttachedNetworkConnectionImpl
    implements AttachedNetworkConnection, AttachedNetworkConnection.Definition, AttachedNetworkConnection.Update {
    private AttachedNetworkConnectionInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String networkConnectionId() {
        return this.innerModel().networkConnectionId();
    }

    public String networkConnectionLocation() {
        return this.innerModel().networkConnectionLocation();
    }

    public HealthCheckStatus healthCheckStatus() {
        return this.innerModel().healthCheckStatus();
    }

    public DomainJoinType domainJoinType() {
        return this.innerModel().domainJoinType();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AttachedNetworkConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String devCenterName;

    private String attachedNetworkConnectionName;

    public AttachedNetworkConnectionImpl withExistingDevcenter(String resourceGroupName, String devCenterName) {
        this.resourceGroupName = resourceGroupName;
        this.devCenterName = devCenterName;
        return this;
    }

    public AttachedNetworkConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedNetworks()
                .createOrUpdate(
                    resourceGroupName, devCenterName, attachedNetworkConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public AttachedNetworkConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedNetworks()
                .createOrUpdate(
                    resourceGroupName, devCenterName, attachedNetworkConnectionName, this.innerModel(), context);
        return this;
    }

    AttachedNetworkConnectionImpl(String name, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = new AttachedNetworkConnectionInner();
        this.serviceManager = serviceManager;
        this.attachedNetworkConnectionName = name;
    }

    public AttachedNetworkConnectionImpl update() {
        return this;
    }

    public AttachedNetworkConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedNetworks()
                .createOrUpdate(
                    resourceGroupName, devCenterName, attachedNetworkConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public AttachedNetworkConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedNetworks()
                .createOrUpdate(
                    resourceGroupName, devCenterName, attachedNetworkConnectionName, this.innerModel(), context);
        return this;
    }

    AttachedNetworkConnectionImpl(
        AttachedNetworkConnectionInner innerObject,
        com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.devCenterName = Utils.getValueFromIdByName(innerObject.id(), "devcenters");
        this.attachedNetworkConnectionName = Utils.getValueFromIdByName(innerObject.id(), "attachednetworks");
    }

    public AttachedNetworkConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedNetworks()
                .getByDevCenterWithResponse(
                    resourceGroupName, devCenterName, attachedNetworkConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public AttachedNetworkConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedNetworks()
                .getByDevCenterWithResponse(resourceGroupName, devCenterName, attachedNetworkConnectionName, context)
                .getValue();
        return this;
    }

    public AttachedNetworkConnectionImpl withNetworkConnectionId(String networkConnectionId) {
        this.innerModel().withNetworkConnectionId(networkConnectionId);
        return this;
    }
}
