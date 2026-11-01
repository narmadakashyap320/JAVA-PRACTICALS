## Practical 08: Store Form Data using JDBC

# Aim

To develop a Java application that stores the data entered into form fields in a MySQL database using JDBC connectivity.

# Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- Java Swing

# Concepts Covered

- JDBC connectivity
- Database connection
- DriverManager
- Connection interface
- PreparedStatement
- SQL INSERT command
- Exception handling
- GUI form handling

# Tools Required

- JDK
- MySQL Server 8.0
- MySQL Workbench or MySQL Command Line Client
- MySQL Connector/J
- VS Code / Eclipse

# Files Included

- `DatabaseLoginForm.java` – Login form application.
- `DBConnection.java` – Database connection class.
- `database.sql` – Database and table creation queries.
- `output.png` – Application output screenshot.

# Working Procedure

1. Create a MySQL database named java_practicals.
2. Create a table named login_details.
3. Establish a database connection using JDBC.
4. Create a form containing name and password fields.
5. Enter the required details.
6. Use PreparedStatement to insert the data.
7. Display a success message after insertion.

# Expected Outcome

The entered name and password are successfully stored in the MySQL database.

# Learning Outcomes

- Understand JDBC architecture.
- Learn how Java connects with MySQL.
- Perform database insertion operations.
- Understand PreparedStatement and SQL queries.


