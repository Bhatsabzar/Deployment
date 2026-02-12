# Use Java 21 (match your project)
FROM eclipse-temurin:21-jdk

# App directory inside container
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
