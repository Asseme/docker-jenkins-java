FROM openjdk:8
ExPOSE 8081
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java","jar","/docker-jenkins-integration.jar"]