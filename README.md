Waste Category Management API

This project provides an API to manage waste categories, with endpoints for creating, retrieving, updating, and deleting categories. It uses an H2 in-memory database for data storage and follows a layered architecture for handling requests.
Features

    Create, retrieve, update, and delete waste categories.
    An H2 in-memory database is used to store waste category data.
    Implements a clean architecture with separate components for controllers, services, and repositories.

Entities
WasteCategory

    Attributes:
        id: (Integer, Primary Key) Unique identifier for each category.
        name: (String) Name of the waste category.
        description: (String) Detailed description of the waste category.

Endpoints
1. GET /api/categories

    Description: Retrieve a list of all waste categories.
    Response: A list of waste categories.
    ScreenShot:

    Screenshot 2025-01-15 at 16 47 58

3. POST /api/categories
Description: Create a new waste category.
Request Body:

{
  "name": "Category Name",
  "description": "Category Description"
}

    Response: The created waste category.
    ScreenShot:
    
    Screenshot 2025-01-15 at 16 47 47

3. PUT /api/categories/{id}
Description: Update an existing waste category.
Request Body:

{
  "name": "Updated Category Name",
  "description": "Updated Category Description"
}

    Response: The updated waste category.
    ScreenShot:
    
    Screenshot 2025-01-15 at 16 48 28

4. DELETE /api/categories/{id}

    Description: Delete a specific waste category by ID.
    Response: Confirmation of the deletion.
    ScreenShot:

    Screenshot 2025-01-15 at 16 49 06

6. GET /api/categories/{id}

    Description: Retrieve details of a specific waste category by ID.
    Response: A single waste category.
    ScreenShot:

    Screenshot 2025-01-15 at 16 48 19

Components
1. Controller

    Maps API requests to service calls.
    Handles input validation and formats responses.

2. Service

    Contains the business logic for managing waste categories.
    Performs necessary operations like validation and logic processing.

3. Repository

    Interfaces with the H2 database to persist and retrieve data.
    Provides methods to interact with the WasteCategory table in the database.

4. Model

    A JPA entity mapped to a database table.
    The WasteCategory class represents a waste category in the system.

5. Exception

    Responsible for handling exceptions related to invalid input and illegal arguments within the application.
    It provides custom responses with appropriate HTTP status codes.

Database
H2 In-Memory Database

    Table: WasteCategory
        Columns:
            id: (Primary Key)
            name: (String)
            description: (String)

Project Flow

    The client sends a request to the controller.

    The controller delegates the task to the service.

    The service interacts with the repository to perform operations on the H2 database.

    Data is returned to the client in response to the request.

    Simple Diagram:
    
    Screenshot 2025-01-16 at 16 04 41

How to Run

Clone the repository:

git clone https://github.com/asandilenkala/REST-API-Assessment.git

Navigate to the project directory:

cd com.enviro.assessment.grad001.asandilenkala

Run the application:

./mvnw spring-boot:run

    The API will be available at http://localhost:8090.

Technologies Used

    Spring Boot
    H2 In-Memory Database
    Java 21
