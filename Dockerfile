FROM openjdk:8-jre

COPY target/simple-boot-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java","-jar","/myapp.jar"]