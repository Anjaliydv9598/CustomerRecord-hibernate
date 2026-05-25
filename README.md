# CustomerRecord - Hibernate + PostgreSQL

CustomerRecord is a simple Java project built using Hibernate ORM and PostgreSQL database.  
This project performs basic CRUD operations for managing customer records.

---

## 🚀 Technologies Used

- Java
- Hibernate ORM
- PostgreSQL
- Maven
- JDBC

---

## 📌 Features

- Add Customer
- View Customer
- Update Customer
- Delete Customer
- Database Connectivity using Hibernate

---

## 📂 Project Structure

src/main/java  
├── entity  
├── dao  
├── controller  

src/main/resources  
└── META-INF  
    └── persistence.xml

---

## ⚙️ Database Configuration

Update your `persistence.xml` file:

```xml
<property name="javax.persistence.jdbc.url"
          value="jdbc:postgresql://localhost:5432/postgres"/>

<property name="javax.persistence.jdbc.user"
          value="postgres"/>

<property name="javax.persistence.jdbc.password"
          value="root"/>
