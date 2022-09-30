FROM adoptopenjdk:11
ARG JAR_FILE=qeatsbackend/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]