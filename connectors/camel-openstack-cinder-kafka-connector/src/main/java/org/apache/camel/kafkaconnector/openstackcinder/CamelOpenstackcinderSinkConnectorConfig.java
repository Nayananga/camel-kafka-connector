/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.openstackcinder;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelOpenstackcinderSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_OPENSTACKCINDER_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_OPENSTACKCINDER_PATH_HOST_DOC = "OpenStack host url";
    public static final String CAMEL_SINK_OPENSTACKCINDER_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_API_VERSION_CONF = "camel.sink.endpoint.apiVersion";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_API_VERSION_DOC = "OpenStack API version One of: [V2] [V3]";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_API_VERSION_DEFAULT = "V3";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_CONFIG_CONF = "camel.sink.endpoint.config";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_CONFIG_DOC = "OpenStack configuration";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_DOMAIN_CONF = "camel.sink.endpoint.domain";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_DOMAIN_DOC = "Authentication domain";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_DOMAIN_DEFAULT = "default";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_OPERATION_DOC = "The operation to do";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PASSWORD_DOC = "OpenStack password";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PROJECT_CONF = "camel.sink.endpoint.project";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PROJECT_DOC = "The project ID";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PROJECT_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SUBSYSTEM_CONF = "camel.sink.endpoint.subsystem";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SUBSYSTEM_DOC = "OpenStack Cinder subsystem One of: [snapshots] [volumes]";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SUBSYSTEM_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_USERNAME_DOC = "OpenStack username";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSTACKCINDER_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.openstack-cinder.lazyStartProducer";
    public static final String CAMEL_SINK_OPENSTACKCINDER_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_OPENSTACKCINDER_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_OPENSTACKCINDER_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.openstack-cinder.basicPropertyBinding";
    public static final String CAMEL_SINK_OPENSTACKCINDER_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_OPENSTACKCINDER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelOpenstackcinderSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelOpenstackcinderSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_OPENSTACKCINDER_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_OPENSTACKCINDER_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_API_VERSION_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_CONFIG_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_DOMAIN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_DOMAIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_DOMAIN_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PROJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PROJECT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_PROJECT_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SUBSYSTEM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SUBSYSTEM_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SUBSYSTEM_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSTACKCINDER_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_OPENSTACKCINDER_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_OPENSTACKCINDER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_OPENSTACKCINDER_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}