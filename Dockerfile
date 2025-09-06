# Use the official OpenJDK 21 base image
FROM amazoncorretto:21

COPY target/userservice-1.0.0.jar userservice-1.0.0.jar

ENTRYPOINT ["java", "-jar", "/userservice-1.0.0.jar"]
