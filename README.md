[![Build status](https://circleci.com/gh/Leward/hello.svg?&style=shield&circle-token=3ac863c8cd63eca92a6e3fc94fa6617ac0c95874)](https://circleci.com/gh/Leward/hello)


Run project: 

```
mvn spring-boot:run
```

Verify it works:

```
curl http://localhost:8080/hello
```

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

The project build the `leward/hello` docker image.

Run the project using docker: 
```
docker pull leward/hello && \
    docker run -d -p 8080:8080 --name=hello leward/hello
```