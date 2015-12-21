### Spring Cloud Cloud Foundry User-Defined-Service Connector

This application demonstrates how to create a spring boot app which connects to CF services bound to the app.


### Create Postgres Service
```
cf cs SERVICE_NAME SERVICE_PLAN SERVICE_NAME
```

### Update manifest.yml to connect to the Postgres Service
Example manifest:
```
---
applications:
  - name: app-webservice
    memory: 512M
    buildpack: java_buildpack
    path: target/predix-spring-cloud-0.0.1.jar
    services:
        - SERVICE_NAME
    env:
      SPRING_PROFILES_ACTIVE: cloud
```

### Config class to connect to CF DB service
```
package com.ge.predix.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@Profile("cloud")
@EnableJpaRepositories("com.ge.predix.repositories")
public class CloudDataSourceConfig extends AbstractCloudConfig {
    @Bean
    public DataSource dataSource() {
        return connectionFactory().dataSource();
    }

}
```