FROM openjdk:8
ADD target/docker-spring-boot-credit.jar docker-spring-boot-credit.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","docker-spring-boot-credit.jar" ]