### TMS Webservice created with Sring & Spring Boot

CloudDataSourceConfig.java creates a datasource bean connection to the only relational database service bound to the app.

### Spring Cloud Connector
For documentation, please visit https://docs.cloudfoundry.org/buildpacks/java/spring-service-bindings.html

### Clean and package
```
cd into directory
mvn clean package
```

### Push to Cloud Foundry
ensure you edit the manifest file with the app name and services
```
cf push
```
