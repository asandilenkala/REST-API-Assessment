# Enviro365 Waste Sorting Mobile Application REST API

This repository contains the REST APIs for the Enviro365 Waste Sorting Mobile Application, built using Spring Boot and H2 in-memory database.

## Project Overview
Enviro365 aims to promote efficient waste sorting through a mobile application that leverages a robust backend API for managing waste categories, user profiles, and sorting instructions.

## Technologies Used
- **Spring Boot**: Backend framework
- **H2 Database**: In-memory database for testing and development
- **Spring Data JPA**: Data persistence
- **Spring Security**: Authentication and authorization
- **Swagger**: API documentation

## Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/asandilenkala/REST-API-Assessment.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd com.enviro.assessment.grad001.asandilenkala
   ```
3. **Build the project:**
   ```sh
   ./mvnw clean install
   ```
4. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```

## API Endpoints
| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| GET    | /api/waste-categories     | Fetch all waste categories      |
| POST   | /api/waste-categories     | Add a new waste category        |
| GET    | /api/waste-categories/{id}| Fetch category by ID            |
| PUT    | /api/waste-categories/{id}| Update category by ID           |
| DELETE | /api/waste-categories/{id}| Delete category by ID           |

## Database Configuration
The application uses an H2 in-memory database. Access the H2 console at:
```
http://localhost:8080/h2-console
```
Use the following credentials:
- **URL:** jdbc:h2:mem:testdb
- **Username:** sa
- **Password:**

## API Documentation
Swagger UI is available at:
```
http://localhost:8080/swagger-ui.html
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.

---

_Developed by Asandile Nkala for the Enviro365 Waste Sorting Mobile Application._

