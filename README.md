# 🚀 Task Manager API

A RESTful backend application built using Spring Boot that simulates a task management system with user-task relationships, filtering capabilities, Spring Security authentication, and Swagger API documentation.

---

# 🧠 Project Overview

This project was built to strengthen backend development fundamentals by applying real-world concepts such as:

* REST API design
* Layered architecture
* JPA entity relationships
* Query derivation
* Spring Security
* API documentation

The system allows authenticated users to manage and filter tasks assigned to users.

---

# ⚙️ Tech Stack

* Java 26
* Spring Boot 4
* Spring Data JPA
* Spring Security
* PostgreSQL
* Maven
* Swagger OpenAPI
* Lombok

---

# 🧱 Features

## ✅ Task Management

* Create task for a user
* Get all tasks
* Get task by ID

---

## ✅ Advanced Filtering

* Get tasks by user
* Get tasks by status
* Get tasks by user and status

---

## ✅ Security

* HTTP Basic Authentication enabled
* All endpoints are protected using Spring Security

---

## ✅ API Documentation

Interactive Swagger UI integrated for testing APIs directly from the browser.

Access:

```text id="yo7j80"
http://localhost:8080/swagger-ui/index.html
```

---

# 🗄️ Database Design

## 👤 User Entity

* userId
* name
* email

---

## 📋 Task Entity

* taskId
* task
* details
* status
* user (Many-to-One relationship)

---

# 🔗 Relationship

```text id="fr0c6h"
One User → Many Tasks
```

Implemented using:

```java id="gy5v3p"
@ManyToOne
@JoinColumn(name = "user_id")
private User user;
```

---

# 📁 Project Structure

```text id="nuk7zl"
src/main/java/com/mickey/task_manager_api
│
├── controllers
├── services
├── repositories
├── models
├── config
```

---

# 🔗 API Endpoints

## 📋 Task APIs

| Method | Endpoint                                 | Description                     |
| ------ | ---------------------------------------- | ------------------------------- |
| POST   | /api/tasks/user/{userId}                 | Create task for user            |
| GET    | /api/tasks                               | Get all tasks                   |
| GET    | /api/tasks/{id}                          | Get task by ID                  |
| GET    | /api/tasks/user/{userId}                 | Get tasks by user               |
| GET    | /api/tasks/status/{status}               | Get tasks by status             |
| GET    | /api/tasks/user/{userId}/status/{status} | Filter tasks by user and status |

---

# 🔐 Authentication

Spring Security Basic Authentication is enabled.

When accessing APIs:

* Username: `user`
* Password: generated in console during startup

Example:

```text id="f4o6t4"
Using generated security password: xxxxxxxx
```

---

# 🧪 Swagger API Testing

After running the application:

```text id="j3l11m"
http://localhost:8080/swagger-ui/index.html
```

You can:

* Test APIs directly
* Send request bodies
* View endpoint documentation

---

# 🗄️ PostgreSQL Configuration

Example `application.properties`:

```properties id="wrpn0o"
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 🚀 Running the Project

## 1. Clone Repository

```bash id="a3g1n6"
git clone <repository-url>
```

---

## 2. Configure PostgreSQL

Create database:

```sql id="r4xxy5"
CREATE DATABASE taskdb;
```

---

## 3. Run Application

```bash id="4q1mps"
mvn spring-boot:run
```

---

## 4. Access Swagger

```text id="d2h2iu"
http://localhost:8080/swagger-ui/index.html
```

---

# 🧠 Key Learnings

* Building REST APIs with Spring Boot
* Using JPA entity relationships
* Spring Data query derivation
* Layered backend architecture
* HTTP response handling with ResponseEntity
* Securing APIs using Spring Security
* Integrating Swagger documentation

---

# 🔮 Future Improvements

* JWT Authentication
* Role-based authorization
* DTO layer implementation
* Global exception handling
* Logging system
* Docker deployment
* Frontend integration

---

# 👨‍💻 Author

Mickey

---

# ⭐ Final Note

This project represents a transition from learning isolated backend concepts to designing connected backend systems with production-oriented backend architecture.
