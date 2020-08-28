FROM openjdk:13-alpine3.10

MAINTAINER nils.gloor@gibmit.ch

EXPOSE 5000

WORKDIR /usr/local/bin

COPY ./target/knw_m154-crm-web-0.0.1-SNAPSHOT-shaded.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]