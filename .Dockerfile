# Use an official Java runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Install Maven and build the application
RUN apt-get update && apt-get install -y maven \
    && mvn clean package

# Specify the command to run the application
CMD ["java", "-jar", "target/Testing-0.0.1-SNAPSHOT.jar"] 
