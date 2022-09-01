FROM gradle:7.5.1-jdk17

COPY * /

EXPOSE 8080

ENTRYPOINT  ["java", "-jar","/gateway-1.0.jar"]


