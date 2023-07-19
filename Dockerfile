FROM maven:3.8.3-openjdk-17 as build
COPY . .
RUN mvn clean package -DskipTests

FROM  openjdk:17.0.1-jdk-slim
COPY --from=build /target/SecureId-1.0.RELEASE.jar demo.jar
EXPOSE 8080 
ENTRYPOINT ["java","-jar","demo.jar"]
