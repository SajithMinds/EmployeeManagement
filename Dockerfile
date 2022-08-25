FROM openjdk:17
VOLUME /tmp
ADD target/EmployeeManagement-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]