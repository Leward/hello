[![CircleCI](https://circleci.com/gh/Leward/hello.svg?style=svg)](https://circleci.com/gh/Leward/hello)
[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=eu.leward:hello&metric=alert_status)](https://sonarcloud.io/dashboard?id=eu.leward:hello)

Run project: 

```
mvn spring-boot:run
```

Verify it works:

```
curl http://localhost:8080/hello
```

## Tool chain

The code exposes a REST API using Java and Spring Boot.

The project is built using Maven.

CircleCI is used for the Continuous Integration.

The build creates a Docker image that is deployed on Rancher by Cicle CI.

The CircleCI build also monitor the code quality using Sonarqube hosted at Sonarcloud. 

## Circle CI

Environment variables to configure on [circleci.com](https://circleci.com): 

- `DOCKER_USERNAME` 
- `DOCKER_PASSWORD`
- `GITHUB_TOKEN`
- `RANCHER_ACCESS_KEY`
- `RANCHER_SECRET_KEY`
- `RANCHER_URL`
- `SONAR_LOGIN`


The project is built on Circle CI. 
The build configuration can be found under the `.circleci/` directory.

Before comitting changes to the `.circleci/config.yml` file, 
[validate its configuration](https://circleci.com/docs/2.0/local-jobs/#validating-20-yaml-syntax).

## Docker

The project builds the `leward/hello` docker image.

Run the project using docker: 
```
docker pull leward/hello && \
    docker run -d -p 8080:8080 --name=hello leward/hello
```
