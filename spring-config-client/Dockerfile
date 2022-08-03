FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY ./build/libs/spring-config-client-0.0.1-SNAPSHOT.jar app.jar
RUN ls
ENTRYPOINT ["java","-jar","/app.jar"]