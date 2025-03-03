// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for Pipelines Delete. */
public final class PipelinesDeleteSamples {
    /**
     * Sample code: Pipelines_Delete.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void pipelinesDelete(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .pipelines()
            .deleteWithResponse("exampleResourceGroup", "exampleFactoryName", "examplePipeline", Context.NONE);
    }
}
