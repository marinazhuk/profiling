FROM eclipse-temurin:17-jdk-jammy
COPY target/profiling-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]