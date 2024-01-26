FROM openjdk:21

RUN echo ${pwd} && la -lR
COPY build/libs ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
