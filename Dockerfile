FROM openjdk
COPY target/*.jar /
EXPOSE 8080
ENTRYPOINT ["java","-jar","/sample-jenkin-1.0-SNAPSHOT.jar"]
