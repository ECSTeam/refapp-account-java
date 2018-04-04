#!/bin/bash

mkdir -p refapp-account-java-release
cd refapp-gateway-java

mvn package
cp target/*.jar ../refapp-account-java-release/

cd ../refapp-account-java-release
tar -zcvf refapp-account-java.tar.gz *.jar