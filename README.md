# ProductPriceUpdater-JDBC
Java console application using JDBC and MySQL to update product prices by ID. Users enter a product ID and new price, and the system executes an UPDATE query with PreparedStatement. Demonstrates secure parameterized queries, executeUpdate() for row count, and exception handling in a modular DAO structure.

# Product Price Updater (Java + JDBC)

## Overview
A simple Java console application that connects to a MySQL database using JDBC.  
It allows users to update the price of a product by entering its product ID and the new price. The project demonstrates secure database operations with `PreparedStatement`, execution of `UPDATE` queries, and handling update counts with `executeUpdate()`.

---

## Objectives
- Update product prices in the database by product ID.
- Demonstrate `UPDATE` queries using JDBC.
- Use `PreparedStatement` for safe parameterized queries.
- Handle update counts with `executeUpdate()`.

---

## Tech Stack
- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J (JDBC driver)

---

## Project Structure

ProductPriceUpdater/ │ ├── src/com/product/updater/ │   ├── Product.java          # Model class │   ├── ProductDAO.java       # Handles UPDATE queries │   ├── DBConnection.java     # Utility for DB connection │   └── Main.java             # Console entry point │ ├── sql/products_table.sql    # SQL script to create DB & table └── README.md                 # Documentation


---

## Database Setup
Run this SQL script before starting the program:

```sql
CREATE DATABASE productdb;

USE productdb;

CREATE TABLE products (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    price DOUBLE
);

-- Sample data
INSERT INTO products VALUES (1, 'Laptop', 55000.00);
INSERT INTO products VALUES (2, 'Phone', 25000.00);


How to Run

- Clone the repo:
git clone https://github.com/your-username/ProductPriceUpdater.git

- Add the MySQL JDBC driver (mysql-connector-j-x.x.x.jar) to your classpath.
- Update DBConnection.java with your MySQL username and password.

- Compile and run:
javac src/com/product/updater/*.java
java com.product.updater.Main



Sample Output
=== Product Price Updater ===
Enter Product ID: 1
Enter New Price: 60000
✅ Price updated successfully!




