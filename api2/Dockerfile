FROM openjdk:21

RUN echo ${pwd} && la -lR
COPY api2/build/libs/api2.jar ./app.jar

ENTRYPOINT ["java","-jar","./app.jar"]
