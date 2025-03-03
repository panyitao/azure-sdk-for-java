// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimes GetMonitoringData. */
public final class IntegrationRuntimesGetMonitoringDataSamples {
    /**
     * Sample code: IntegrationRuntimes_GetMonitoringData.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void integrationRuntimesGetMonitoringData(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .integrationRuntimes()
            .getMonitoringDataWithResponse(
                "exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime", Context.NONE);
    }
}
