# Backend_Traini8_ManishKanyal
Assignment for the position of "Software Development" Internship profile

# Training Center Management System Project Setup Guide

Welcome to the Training Center Management System. This application allows you to manage training centers and their related information. This guide provides detailed instructions for setting up the application.

## Prerequisites
Before you begin, ensure you have the following installed:

* Java Development Kit (JDK) 8 or later
* Maven 
* Your favorite IDE with Lombok plugin installed (e.g., IntelliJ IDEA, Eclipse)
* Postman application to make request

### Steps to Setup
* Open the file named Traini8 in your preferred IDE 
* Reload the maven project , to fetch the dependency declared in pom.xml file
* If you have your own database , open application.properties file in `src/main/resources/application.properties` and change the configuration related to database . Below are properties provided that need to be changed in case another database is used
```
spring.datasource.url => Provide the url related to your database
spring.datasource.driverClassName =>  Provide the driver name which is compatible with your database
spring.jpa.database-platform => Provide the Dialect detail which is related to your database
spring.datasource.username =>  username of your database
spring.datasource.password => password of your database
```

* Go to `Traini8Application` file  in path `src/main/java/com/traini8/Traini8/Traini8Application.java` and run springboot application.
* In console , you can find in which port our springboot web app is running in.
* Open postman and import the file named `Buyoga.postman_collection` 
* Open the Buyoga folder and you will find the the different requests .
* Send the request to given endpoints and test both valid and invalid inputs to verify validation and database operations.
    


