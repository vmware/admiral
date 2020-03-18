/*
 * Copyright (c) 2017-2020 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.admiral.test.integration.client;

import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.vmware.admiral.test.integration.client.dcp.DcpDocumentKind;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@DcpDocumentKind("com:vmware:photon:controller:model:adapters:registry:PhotonModelAdaptersRegistryService:PhotonModelAdapterConfig")
public class PhotonModelAdapterConfig extends ServiceDocument {

    /** (Mandatory) id of the photon model adapter config entity */
    public String id;

    /** name of the photon model adapter config entity */
    public String name;

    /** Custom properties. */
    public Map<String, String> customProperties;

    /** Adapter endpoints map. */
    public Map<String, String> adapterEndpoints;

}
