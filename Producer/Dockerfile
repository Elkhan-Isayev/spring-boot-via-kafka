FROM openjdk:18-jdk
EXPOSE 8080
ADD target/*.jar app.jar
ENTRYPOINT [ "java" ]
CMD ["-Xms64m", "-Xmx512m", "-jar", "/app.jar"]