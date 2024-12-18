FROM openjdk:19-jdk-alpine
WORKDIR /app
COPY target/spring-hello-1.0-SNAPSHOT.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]
EXPOSE 8080