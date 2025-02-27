# Spring Boot H2 Database Application

This is a simple Spring Boot application that uses an H2 in-memory database. The application provides REST endpoints to manage a `User` entity. It includes global error handling to make error messages more understandable for the consumer.


## Requirements
- Java 11 or higher
- Maven 3.6.3 or higher

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/spring-boot-h2-app.git
    cd spring-boot-h2-app
    ```

2. Build the project:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```


## Endpoints
- **Create User**
    - `POST /api/users`
    - Request Body:
      ```json
      {
        "name": "John Doe",
        "email": "john.doe@example.com"
      }
      ```
    - Response: Created user object

- **Get User by ID**
    - `GET /api/users/{id}`
    - Response: User object if found, otherwise an error message

- **Get All Users**
    - `GET /api/users`
    - Response: List of all users

- **Update User**
    - `PUT /api/users/{id}`
    - Request Body:
      ```json
      {
        "name": "John Doe",
        "email": "john.doe@example.com"
      }
      ```
    - Response: Updated user object if found, otherwise an error message

- **Delete User**
    - `DELETE /api/users/{id}`
    - Response: No content if successful

## Error Handling
The application includes global error handling to manage exceptions and return meaningful error messages. Common error responses include:
- `404 Not Found`: When a user is not found
- `500 Internal Server Error`: For any other unhandled exceptions

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
