// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.dashboard.models.PrivateEndpointConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionListResultTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupIds\":[],\"provisioningState\":\"Creating\"},\"id\":\"zgqexz\",\"name\":\"ocxscpaierhhbcs\",\"type\":\"l\"},{\"properties\":{\"groupIds\":[],\"provisioningState\":\"Deleting\"},\"id\":\"aodxo\",\"name\":\"nbdxk\",\"type\":\"pxokajionp\"},{\"properties\":{\"groupIds\":[],\"provisioningState\":\"Creating\"},\"id\":\"xgcp\",\"name\":\"dg\",\"type\":\"aajrm\"},{\"properties\":{\"groupIds\":[],\"provisioningState\":\"Failed\"},\"id\":\"ovmclwhijcoejct\",\"name\":\"zaqsqsycbkbfk\",\"type\":\"ukdkexxppofmxa\"}],\"nextLink\":\"fjpgddtocjjxhvp\"}")
                .toObject(PrivateEndpointConnectionListResult.class);
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner().withGroupIds(Arrays.asList()),
                            new PrivateEndpointConnectionInner().withGroupIds(Arrays.asList()),
                            new PrivateEndpointConnectionInner().withGroupIds(Arrays.asList()),
                            new PrivateEndpointConnectionInner().withGroupIds(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
    }
}
