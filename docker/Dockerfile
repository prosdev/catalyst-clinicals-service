FROM java:8-alpine

# Add Compiled Spring Boot Package
VOLUME /tmp
ADD catalyst-clinicals-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]