// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandPayload;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandRequest;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugCommandType;

/** Samples for DataFlowDebugSession ExecuteCommand. */
public final class DataFlowDebugSessionExecuteCommandSamples {
    /**
     * Sample code: DataFlowDebugSession_ExecuteCommand.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void dataFlowDebugSessionExecuteCommand(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager
            .dataFlowDebugSessions()
            .executeCommand(
                "exampleResourceGroup",
                "exampleFactoryName",
                new DataFlowDebugCommandRequest()
                    .withSessionId("f06ed247-9d07-49b2-b05e-2cb4a2fc871e")
                    .withCommand(DataFlowDebugCommandType.EXECUTE_PREVIEW_QUERY)
                    .withCommandPayload(new DataFlowDebugCommandPayload().withStreamName("source1").withRowLimits(100)),
                Context.NONE);
    }
}
