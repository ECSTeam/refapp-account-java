#!/bin/bash -e

set -x
pwd
cd refapp-account-java-release
ls -al
cf login --skip-ssl-validation -o $CF_ORG -s $CF_SPACE -a $CF_API -u $CF_API_USER -p $CF_API_PASSWORD
CMD="cf push -m750m refapp-account-java -p refapp-account-java-0.0.1-SNAPSHOT.jar"
echo $CMD
$CMD
