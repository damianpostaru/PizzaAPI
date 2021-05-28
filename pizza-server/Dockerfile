FROM openjdk:15-jdk-oraclelinux8

COPY . /opt/pizza-server/

WORKDIR /opt/pizza-server/

RUN ./gradlew clean build --no-daemon -x test

WORKDIR /opt/pizza-server/build/libs/

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar pizza-server-0.0.1-SNAPSHOT.jar" ]