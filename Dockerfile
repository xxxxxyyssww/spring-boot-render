FROM maven:3.9.3-eclipse-temurin-8 as build
COPY . .
RUN mvn clean package -DskipTests

FROM  openjdk:8-jre-slim
COPY --from=build /target/SecureId-1.0.RELEASE.jar zzn.jar
EXPOSE 8080 
ENTRYPOINT ["java","jar","zzn.jar"]
