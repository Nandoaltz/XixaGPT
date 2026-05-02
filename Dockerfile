FROM eclipse-temurin:21
WORKDIR app
COPY target/*.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","app.jar","--server.address=0.0.0.0","--server.port=8000"]