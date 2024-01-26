FROM openjdk:21

RUN pwd
COPY /build/libs/api2.jar ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
