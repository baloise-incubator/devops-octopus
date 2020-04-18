#!/bin/sh
VERSION=v0.1.0
DOCKER_ORG=baloiseincubator
mvn clean install
docker build . -t $DOCKER_ORG/devops-octopus:$VERSION
docker push $DOCKER_ORG/devops-octopus:$VERSION