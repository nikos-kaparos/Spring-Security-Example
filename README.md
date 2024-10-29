# Spring Security Example

This repository demonstrates a basic setup of Spring Security, showcasing fundamental authentication and authorization mechanisms within a Spring Boot application.

## Installation

Clone the repository
```
git clone https://github.com/nikos-kaparos/Spring-Security-Example.git
```

## Build the project with Maven:
```
Copy code
mvn clean package -DskipTests
```

## Usage

First crate table users in database
```sql
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);
```
Then insert the users
```sql
INSERT INTO user (id, username, password) VALUES (1, 'your_username', 'your_passwrd');
```
Run the container
```bash
docker-composae up -d
```
Check the database
```bash
docker exec -it my_postgres_db psql -U myuser -d mydatabase
\dt
```
Login open browser to http://localhost:8080 login and you are free to do Http methods POST GET e.t.c
## Technologies
Java 21

Maven 3.9.9

Docker 27.2.1

Docker compose 1.29.2

PostgreSQL 16.3
