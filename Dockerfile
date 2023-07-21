FROM openjdk:17-alpine
WORKDIR /app
COPY ./target/DevOps_Project_1-0.0.1-SNAPSHOT.jar /app
EXPOSE 8084
CMD ["java","-jar","DevOps_Project_1-0.0.1-SNAPSHOT.jar"]