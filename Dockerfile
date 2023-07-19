FROM openjdk:8 as build
COPY . .
RUN mvn clean package 

FROM  openjdk:18-ea-8-jdk-slim 
COPY --from=build /target/SecureId-1.0.RELEASE.jar zzn.jar
EXPOSE 8080 
ENTRYPOINT ["java","jar","zzn.jar"]
