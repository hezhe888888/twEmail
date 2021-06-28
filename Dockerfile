FROM openjdk:8
EXPOSE 8090
RUN mkdir -p /app/
ADD build/libs/email-0.0.1-SNAPSHOT.jar /app/emailapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/emailapp.jar"]