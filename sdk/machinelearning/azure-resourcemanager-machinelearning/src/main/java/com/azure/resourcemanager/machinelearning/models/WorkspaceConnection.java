// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceConnectionInner;

/** An immutable client-side representation of WorkspaceConnection. */
public interface WorkspaceConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the category property: Category of the workspace connection.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the target property: Target of the workspace connection.
     *
     * @return the target value.
     */
    String target();

    /**
     * Gets the authType property: Authorization type of the workspace connection.
     *
     * @return the authType value.
     */
    String authType();

    /**
     * Gets the value property: Value details of the workspace connection.
     *
     * @return the value value.
     */
    String value();

    /**
     * Gets the valueFormat property: format for the workspace connection value.
     *
     * @return the valueFormat value.
     */
    ValueFormat valueFormat();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceConnectionInner object.
     *
     * @return the inner object.
     */
    WorkspaceConnectionInner innerModel();

    /** The entirety of the WorkspaceConnection definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The WorkspaceConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the WorkspaceConnection definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the WorkspaceConnection definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the WorkspaceConnection definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithCategory,
                DefinitionStages.WithTarget,
                DefinitionStages.WithAuthType,
                DefinitionStages.WithValue,
                DefinitionStages.WithValueFormat {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            WorkspaceConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            WorkspaceConnection create(Context context);
        }
        /** The stage of the WorkspaceConnection definition allowing to specify category. */
        interface WithCategory {
            /**
             * Specifies the category property: Category of the workspace connection..
             *
             * @param category Category of the workspace connection.
             * @return the next definition stage.
             */
            WithCreate withCategory(String category);
        }
        /** The stage of the WorkspaceConnection definition allowing to specify target. */
        interface WithTarget {
            /**
             * Specifies the target property: Target of the workspace connection..
             *
             * @param target Target of the workspace connection.
             * @return the next definition stage.
             */
            WithCreate withTarget(String target);
        }
        /** The stage of the WorkspaceConnection definition allowing to specify authType. */
        interface WithAuthType {
            /**
             * Specifies the authType property: Authorization type of the workspace connection..
             *
             * @param authType Authorization type of the workspace connection.
             * @return the next definition stage.
             */
            WithCreate withAuthType(String authType);
        }
        /** The stage of the WorkspaceConnection definition allowing to specify value. */
        interface WithValue {
            /**
             * Specifies the value property: Value details of the workspace connection..
             *
             * @param value Value details of the workspace connection.
             * @return the next definition stage.
             */
            WithCreate withValue(String value);
        }
        /** The stage of the WorkspaceConnection definition allowing to specify valueFormat. */
        interface WithValueFormat {
            /**
             * Specifies the valueFormat property: format for the workspace connection value.
             *
             * @param valueFormat format for the workspace connection value.
             * @return the next definition stage.
             */
            WithCreate withValueFormat(ValueFormat valueFormat);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    WorkspaceConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    WorkspaceConnection refresh(Context context);
}
