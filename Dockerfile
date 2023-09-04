FROM maven:latest AS maven
WORKDIR /usr/src/app
COPY . /usr/src/app/
RUN mvn clean package -DskipTests

FROM openjdk:21-ea-17-jdk-slim
WORKDIR /opt/app
COPY --from=maven /usr/src/app/target/spring-runner-0.0.1.jar /opt/app/final.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "final.jar" ]
