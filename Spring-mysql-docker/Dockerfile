#
# Build stage
#
FROM openjdk:21
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring_rest_docker.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]