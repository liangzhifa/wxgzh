FROM java:8
USER root
VOLUME /tmp
ARG wxgzh
COPY target/wxgzh.jar app.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","/app.jar"]
