# Dropwizard Project Template

Dropwizard sample maven project with modules as per best practise

* Build the project
`$ dropwizard-project-template > mvn clean install`

* Run Application as a Server
`$ dropwizard-project-template > java -jar ./template-application/target/template-application-0.1.0-SNAPSHOT.jar server ./template-application/src/main/assembly/docker/template-app/template.yml`

`$ dropwizard-project-template > curl http://localhost:8080/template`

* Test Sample output
`{"id":1,"content":"Hello, Stranger!"}`
