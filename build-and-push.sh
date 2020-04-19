#!/bin/sh
VERSION=v0.2.0
DOCKER_ORG=baloiseincubator
docker build . -t $DOCKER_ORG/devops-octopus:$VERSION
docker push $DOCKER_ORG/devops-octopus:$VERSION