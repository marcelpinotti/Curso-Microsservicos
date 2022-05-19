FROM openjdk:11
VOLUME /tmp
ADD ./target/rh-oauth-0.0.1-SNAPSHOT.jar rh-oauth.jar
ENTRYPOINT ["java","-jar","/rh-oauth.jar"]