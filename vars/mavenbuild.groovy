#!/usr/bin/env groovy

def maven_build(){
  sh "mvn clean install"
}
