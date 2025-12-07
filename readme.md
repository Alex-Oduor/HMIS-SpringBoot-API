

# HMIS Backend Service

This is a backend service for a Hospital Management Information System (HMIS). It provides RESTful APIs for managing patients, departments, and users.

# Technologies Used

* Java 21
* Spring Boot 
* Spring Data JPA / Hibernate
* MySQL
* Maven


# Getting Started

## 1. Clone down this repository
````bash
    git clone https://github.com/Alex-Oduor/HMIS-SpringBoot-API
````
## 2. Configure Database:

   Update application.properties with your MySQL credentials:
````
spring.datasource.url=jdbc:mysql://localhost:3306/patients
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
````
## 3. Build and Run

Using Maven:

````bash
mvn clean install
mvn spring-boot:run
````


The service will start at: http://localhost:8080

## API Endpoints
Patient

| Method | URL                 | Description       |
| ------ | ------------------- | ----------------- |
| GET    | `/api/patient`      | Get all patients  |
| GET    | `/api/patient/{id}` | Get patient by ID |
| POST   | `/api/patient`      | Add new patient   |
| PUT    | `/api/patient/{id}` | Update patient    |

Department

| Method | URL               | Description         |
| ------ | ----------------- | ------------------- |
| GET    | `/api/department` | Get all departments |
| POST   | `/api/department` | Add new department  |


User

| Method | URL         | Description   |
| ------ | ----------- | ------------- |
| GET    | `/api/user` | Get all users |
| POST   | `/api/user` | Add new user  |




# Testing

Use Postman or curl to test endpoints.

Example:
````bash
curl -X GET http://localhost:8080/api/patient
````

# System Design Documentation

This project includes complete system design for the entire HMIS.

Architecture Diagrams include:
  * Context diagram
  * Container diagram.
  * Component diagram.


➡️ See [docs](docs/system-design.md) for full details.




