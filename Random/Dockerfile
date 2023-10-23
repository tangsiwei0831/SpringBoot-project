FROM openjdk:21
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/random-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} random.jar
ENTRYPOINT ["java","-jar","/random.jar"]