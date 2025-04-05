# Spring Boot JPA CRUD

A simple Spring Boot application demonstrating **CRUD operations** using **Spring Data JPA** with an in-memory H2 database.

This project provides RESTful APIs for managing entities such as products (or any entity you define) with full Create, Read, Update, and Delete functionality.

---

## 🧰 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (In-memory)
- Maven

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/MSNiharika/SpringBootJPACRUD.git
cd SpringBootJPACRUD

2. Run the Application
./mvnw spring-boot:run

The application will start at:
http://localhost:8080

⸻

🔄 CRUD REST APIs
![image](https://github.com/user-attachments/assets/bac28dc2-7443-4823-88a4-4663e0944bb5)

POST /products
Content-Type: application/json

{
  "name": "Sample Product",
  "description": "Test product",
  "price": 99.99
}

🧪 H2 Console

To explore the database via a web interface:
http://localhost:8080/h2-console
	•	JDBC URL: jdbc:h2:mem:testdb
	•	Username: sa
	•	Password: (leave blank)

⸻

🗂️ Project Structure
├── controller      # REST controllers
├── entity          # JPA entities
├── repository      # Spring Data JPA repositories
├── service         # Business logic layer (if applicable)
└── application.properties

📜 License

This project is open-source and free to use.


Assuming the entity is Product, here are the typical endpoints:
