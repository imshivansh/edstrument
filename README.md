# Edstruments Project

This project is an assessment for Edstruments, developed using Spring Boot. It includes setup for data access via JPA, a web interface, and in-memory database testing with H2. This README provides instructions on how to set up, run, and test the application.

## Prerequisites

Before you start, make sure you have the following installed:
- JDK 17
- Maven 3.6 or later
- An IDE like IntelliJ IDEA (optional, but recommended for ease of use with Spring Boot)

## Setting Up the Project

### Cloning the Repository

First, clone the repository to your local machine:

mvn spring-boot:run
This command will download all necessary dependencies, compile the project, and start the Spring Boot application.
server will start running on port 8080.

CURL Commands for Each Endpoint
1. Get All Products
Fetches all products from the server.
Copy code
curl -X GET http://localhost:8080/api/products -H "Content-Type: application/json"

2. Get Product by ID
Fetches a single product by its ID. Replace {id} with the actual product ID.
curl -X GET http://localhost:8080/api/products/{id} -H "Content-Type: application/json"

4. Create a New Product
Creates a new product. You will need to replace the JSON data in the -d option with the actual product details you wish to add.

curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" \
-d '{
    "productName": "Sample Product",
    "productDescription": "This is a sample description",
    "productPrice": 19
}'


4. Update an Existing Product
Updates an existing product identified by ID. Replace {id} with the actual product ID and adjust the JSON data in the -d option to reflect the updates you want to make.
curl -X PUT http://localhost:8080/api/products/{id} -H "Content-Type: application/json" \
-d '{
   "productName": "Sample Product",
    "productDescription": "This is a sample updated description",
    "productPrice": 25
}'

5. Delete a Product
Deletes a product identified by ID. Replace {id} with the product ID you want to delete.
curl -X DELETE http://localhost:8080/api/products/{id} -H "Content-Type: application/json"
--------------------------------------------------------------------------------------------------------------------------------------------------------
I have also shared the postman collection on email for testing APIs,incase Curl commands gives error.

