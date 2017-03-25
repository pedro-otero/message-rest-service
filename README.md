# message-rest-service

This repository contains a sample app using [Spring Boot][1] and [Maven][2]. It exposes a REST service on `http://localhost:8080/message/{id}`. The `id` path parameter must be one from 5 hardcoded message ids, named `id1`, `id2`, `id3`, `id4` and `id5`. Any other id returns a 404 reply.

Before building it please refer to the Maven [installation instructions][3]. It describes how to add the `mvn` executable to the PATH environment variable, which you need to build the application.

Java 8 is also required, and the JAVA_HOME environment variable must also be set.

All the commands described must be run in the home directory of the folder sources.

# Testing

- Run `mvn test`
- If all tests are succesful it should be explicitly indicated in the command line

# Building

- Run `mvn clean package`. This will run the tests again and create a jar containing the app in the /target directory.

# Running

- Run `java jar target/message-app-1.0.jar`
- Command line must indicate that application started
- Open the web browser and go to any message URL. Example: `http://localhost:8080/v1/messages/id3`

Contact: Pedro Otero, [pedro.otero.prada@gmail.com][4]

[1]:https://projects.spring.io/spring-boot/
[2]:https://maven.apache.org/
[3]:https://maven.apache.org/install.html
[4]:mailto:pedro.otero.prada@gmail.com
