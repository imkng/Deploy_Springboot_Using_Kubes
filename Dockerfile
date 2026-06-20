FROM eclipse-temurin:17-jdk
EXPOSE 8080
Add target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]