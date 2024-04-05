FROM maven:3.8.7-jdk-11

LABEL maintainer="Mateus Hemkemeier <mateus.hemkemeier@betha.com.br>"

WORKDIR /app

COPY . .

RUN mvn package

##token config
#ENV JWT_SECRET=<SECRET>
#ENV daysToTokenExpire=7
##data base
#ENV typeDllAuto="update"
#ENV dataSourceUrl="jdbc:postgresql://localhost:5432/microServiceToken"
#ENV username="postgres"
#ENV password="admin"
#ENV driverName="org.postgresql.Driver"

EXPOSE 8080

CMD ["java", "-jar", "target/microServiceToken-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=prod"]
