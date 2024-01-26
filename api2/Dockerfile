FROM openjdk:21

RUN echo ${pwd} && la -lR
COPY ./api2/build/libs ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
