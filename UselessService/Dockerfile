FROM java:8
VOLUME /tmp
ADD demo-0.0.1-SNAPSHOT.jar demo-app.jar
RUN bash -c 'touch /demo-app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.config.name=production","-Dserver.port=8080","-jar","/demo-app.jar"]