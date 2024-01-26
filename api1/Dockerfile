FROM openjdk:21

RUN pwd
COPY ./build/libs ./app1

ENTRYPOINT ["java","-jar","./app1/api1.jar"]
