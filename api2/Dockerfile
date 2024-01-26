FROM openjdk:21

RUN echo ${pwd} && la -lR
COPY /build/libs/api2.jar ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
