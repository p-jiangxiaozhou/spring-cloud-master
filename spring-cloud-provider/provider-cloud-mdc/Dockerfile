FROM java:8

MAINTAINER takesi<jiangxiaozhou@pupilary.cn>

VOLUME /tmp

ADD provider-cloud-mdc.jar app.jar

RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]