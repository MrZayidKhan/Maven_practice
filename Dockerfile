# Stage 1: Build the application JAR using an official Maven image
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application using a lightweight JRE runtime
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/maven-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
