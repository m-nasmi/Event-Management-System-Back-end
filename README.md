# Event Management System - Back-end

This repository contains the back-end code for the Event Management System, developed using Java Spring Boot.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java JDK 11 or later
- Maven 3.6.3 or later
- XAMPP (or any other application to run MySQL locally)

## Getting Started

### Clone the Repository

To get a local copy up and running, clone the repository:

# Configure the Database
### Install and Run XAMPP:

Download and install XAMPP from Apache Friends.
Start the Apache and MySQL modules from the XAMPP control panel.
Create the Database:

Open your web browser and go to http://localhost/phpmyadmin.
Create a new database named eventmanagement.
Update the Application Properties:

Open the application.properties file located in src/main/resources/ and update it with your database configurations.

spring.datasource.url=jdbc:mysql://localhost:3306/eventmanagement
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Build and Run the Application
Open the Project in IntelliJ IDEA:

Open IntelliJ IDEA.
Select File > Open and navigate to the project directory.
Select the project and click OK to open it.
Build and Run the Application:

Open the EventManagementSystemApplication.java file.
Right-click inside the editor and select Run 'EventManagementSystemApplication'.
Access the Application
Once the application is running, you can access it at http://localhost:8080.

# Contact
If you have any questions or need further information, feel free to reach out:

Muhammed Nasmi
Email: mdnsmi2442@gmail.com
Phone: +94765232442
