FROM openjdk:21-jdk-slim
VOLUME /app
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
