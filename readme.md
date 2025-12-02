# Hospital Information Management System (HIMS) – Spring Boot RESTful API with MySQL

### What does it to?
1. Add a patient.
2. Retrieve all patients records.
3. Retrieve patient by id


## Prerequisites to run this project on your machine.

* Java jdk 21
* A running Mysql Server.
* Postman for testing the endpoints. (optional)
* Your favourite IDE

## To get started

Clone down this repository
````bash
git clone 
````


# To test the Api Endpoints from the terminal


* Adding a patient [POST]
````bash
curl -X POST http://localhost:8080/api/patients \
  -H "Content-Type: application/json" \
  -d "{
    \"name\": \"Sarah Nanyonga\",
    \"age\": 28,
    \"email\": \"sarah@example.com\",
    \"gender\": \"Female\",
    \"seenByDoctor\": true
  }"

 
````
* Retrieving patient record by id [GET]
````bash
curl -X GET http://localhost:8080/api/patients/1
````
* Retrieving all patient records [GET]
````bash
curl -X GET http://localhost:8080/api/patients

````




