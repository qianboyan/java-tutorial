FROM openjdk:latest
COPY target/classes /tmp
WORKDIR /tmp
CMD java dockerdemo.DockerEntry