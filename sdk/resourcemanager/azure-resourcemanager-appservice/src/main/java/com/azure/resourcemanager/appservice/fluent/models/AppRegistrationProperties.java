// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AppRegistration resource specific properties. */
@Fluent
public final class AppRegistrationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppRegistrationProperties.class);

    /*
     * The App ID of the app used for login.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /*
     * The app setting name that contains the app secret.
     */
    @JsonProperty(value = "appSecretSettingName")
    private String appSecretSettingName;

    /**
     * Get the appId property: The App ID of the app used for login.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: The App ID of the app used for login.
     *
     * @param appId the appId value to set.
     * @return the AppRegistrationProperties object itself.
     */
    public AppRegistrationProperties withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appSecretSettingName property: The app setting name that contains the app secret.
     *
     * @return the appSecretSettingName value.
     */
    public String appSecretSettingName() {
        return this.appSecretSettingName;
    }

    /**
     * Set the appSecretSettingName property: The app setting name that contains the app secret.
     *
     * @param appSecretSettingName the appSecretSettingName value to set.
     * @return the AppRegistrationProperties object itself.
     */
    public AppRegistrationProperties withAppSecretSettingName(String appSecretSettingName) {
        this.appSecretSettingName = appSecretSettingName;
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
