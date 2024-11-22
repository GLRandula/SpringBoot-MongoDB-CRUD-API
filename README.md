# SpringBoot-MongoDB-CRUD-API

A simple CRUD API built with Spring Boot and MongoDB.

## Overview

This project is a Spring Boot application that provides a CRUD (Create, Read, Update, Delete) API for managing student records stored in a MongoDB database.

## Features

- Create a new student record
- Retrieve all student records
- Update an existing student record
- Delete a student record

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/GLRandula/SpringBoot-MongoDB-CRUD-API.git
    cd SpringBoot-MongoDB-CRUD-API
    ```

2. **Configure MongoDB:**
    Ensure you have MongoDB installed and running on your local machine or configure the connection to your MongoDB instance in the `application.properties` file.

3. **Build the project:**
    ```bash
    mvn clean install
    ```

4. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

## Usage

Once the application is running, you can interact with the API using tools like Postman or cURL.

## Endpoints

- **Create a student:**
    ```http
    POST /api/v1/student/save
    ```

- **Get all students:**
    ```http
    GET /api/v1/student/getall
    ```

- **Update a student:**
    ```http
    PUT /api/v1/student/edit/{id}
    ```

- **Delete a student:**
    ```http
    DELETE /api/v1/student/delete/{id}
    ```

- **Get a student by ID:**
    ```http
    GET /api/v1/student/search/{id}
    ```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any changes.
