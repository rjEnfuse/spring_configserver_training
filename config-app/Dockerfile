FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE
COPY ./build/libs/config-app-test-0.0.1-SNAPSHOT.jar app.jar
RUN ls
ENTRYPOINT ["java","-jar","/app.jar"]