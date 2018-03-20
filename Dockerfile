FROM java:8
VOLUME ["/tmp"]
RUN mkdir /employeedocker
WORKDIR /employeedocker
COPY target/employee*.jar /employeedocker/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/employeedocker/app.jar"]
