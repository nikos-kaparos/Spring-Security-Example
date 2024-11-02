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
```
Run the container
```bash
docker-composae up -d
```
Check the database
```bash
docker exec -it my_postgres_db psql -U myuser -d mydatabase
\dt
```sql
SELECT * FROM uses;
```
To see the users in database
```
Login open browser to http://localhost:8080 login and you are free to do Http methods POST GET e.t.c
## Technologies
Java 21

Maven 3.9.9

Docker 27.2.1

Docker compose 1.29.2

PostgreSQL 16.3
