FROM openjdk:21

RUN echo ${pwd} && la -lR
COPY ./api1/build/libs ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
