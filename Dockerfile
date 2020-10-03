FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER Hendi Santika "hendisantika@yahoo.co.id"
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080

