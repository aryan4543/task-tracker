# 📝 Task Tracker API

A simple yet production-level Task Tracking backend API built using **Spring Boot**, **Spring Data JPA**, **Hibernate**, and **H2 Database**.

This project allows users to **create**, **read**, **update**, and **delete** tasks, with proper validation, error handling, and a clean layered architecture. It's designed to demonstrate core backend development skills.

---

## 🚀 Features

* Full **CRUD operations** for managing tasks.
* **Validation** for input data using annotations.
* **Custom Exception Handling** with clear error responses.
* Uses **Spring Boot 3.x**, **Spring Data JPA**, and **H2 Database**.
* Layered architecture with clear separation of concerns:

    * `Controller` → `Service` → `Repository`
* Easily replaceable with MySQL or PostgreSQL in the future.
* Fully RESTful API built using standard **HTTP methods**.

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* H2 Database (in-memory)
* Hibernate ORM
* Maven
* IntelliJ IDEA
* Postman (for API testing)

---

## 🧩 Project Structure

```
src/
 └── main/
      └── java/
           └── com/tasktracker/task_tracker/
                ├── controller/       --> REST endpoints
                ├── service/          --> Business logic
                ├── repository/       --> Database access layer
                ├── entity/           --> Task model
                └── exception/        --> Custom error handling
```

---

## 📂 API Endpoints

| Method | Endpoint      | Description          |
| ------ | ------------- | -------------------- |
| GET    | `/tasks`      | Get all tasks        |
| GET    | `/tasks/{id}` | Get task by ID       |
| POST   | `/tasks`      | Create a new task    |
| PUT    | `/tasks/{id}` | Update existing task |
| DELETE | `/tasks/{id}` | Delete task by ID    |

---

## ✅ Validation & Error Handling

* Input validation using annotations like `@NotBlank`, `@Size`.
* Global error handler using `@ControllerAdvice` and `@ExceptionHandler`.
* Custom exception `TaskNotFoundException` for missing tasks.
* All error responses use structured JSON and proper HTTP status codes.

**Example error response:**

```json
{
  "title": "Title must not be blank",
  "description": "Description must be at least 5 characters"
}
```

---

## 🧾 Sample Task Entity

```java
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title must not be blank")
    private String title;

    @Size(min = 5, max = 20, message = "Description must be between 5 and 20 characters")
    private String description;

    private boolean completed;
}
```

---

## ▶️ Setup & Run Locally

### Prerequisites

* Java 17+
* Maven
* IntelliJ IDEA

### Steps

```bash
git clone https://github.com/your-username/task-tracker.git
cd task-tracker
mvn spring-boot:run
```

Visit the app at: `http://localhost:8080/tasks`

---

## 🧪 H2 Database Access

* URL: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:testdb`
* Username: `sa`
* Password: *(leave blank)*

---

## 📈 Future Enhancements

* Add filtering by completed status.
* Add createdAt and updatedAt fields.
* Integrate MySQL/PostgreSQL.
* Add basic frontend (HTML/React).
* Add user login/auth (JWT).

---

## 📃 License

This project is open-source and free to use.

---

## 🙋 About Me

I built this project as part of my Spring Boot backend learning journey. It reflects my hands-on skills in backend development, REST API design, error handling, and layered architecture.

Feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/aryan-kumar-bhardwaj-37b25a286/)!
