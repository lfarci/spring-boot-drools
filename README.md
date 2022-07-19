# Drools: Spring Boot Integration
## Prerequisites
- JDK 18.0.1.1
- Maven 3.8.6

## Usage
```bash
# Starts the web application on port 8080
mvn spring-boot:run
```

You can use Swagger UI at http://localhost:8080/api/swagger-ui.html.

## KIE project setup
This Maven project is a KIE project as specified in the Drools documentation: [Creating and building a Kie project](https://docs.drools.org/7.72.0.Final/drools-docs/html_single/index.html#_creatingandbuildingakieproject). It implies that rules are automatically loaded from the resources folder.

It is also possible to programmatically add artifacts, refer to this sesction: [Defining a KieModule programmatically](https://docs.drools.org/7.72.0.Final/drools-docs/html_single/index.html#_definingakiemoduleprogrammatically).

KIE artifacts are validated and pre-compiled as explained in [Building with Maven](https://docs.drools.org/7.72.0.Final/drools-docs/html_single/index.html#_buildingwithmaven).

## Drools assets development
Business Central Workbench is the web application and repository to govern Drools and jBPM assets. A showcase Docker image is available on [RedHat Quay](https://quay.io/repository/kiegroup/business-central-workbench-showcase).