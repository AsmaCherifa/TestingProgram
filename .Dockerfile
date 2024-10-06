# Dockerfile
FROM maven:3.8.1-openjdk-11-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /app/target/MiniJavaProgram-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
