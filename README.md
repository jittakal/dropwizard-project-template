# dropwizard-project-template
Dropwizard Project Template

`mvn clean install`

`java -jar ./template-application/target/template-application-0.1.0-SNAPSHOT.jar server ./template-application/src/main/assembly/docker/template-app/template.yml`

`curl http://localhost:8080/template`

`{"id":1,"content":"Hello, Stranger!"}`
