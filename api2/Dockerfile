FROM openjdk:21

RUN pwd
COPY ./build/libs ./app2

ENTRYPOINT ["java","-jar","./app2/api2.jar"]
