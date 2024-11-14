# Use an official OpenJDK 17 runtime as a base image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the target directory to the container
COPY target/Weather-0.0.1-SNAPSHOT.jar /app/app.jar

# Specify the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
