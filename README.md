# Spring Security Example

This repository demonstrates a basic setup of Spring Security, showcasing fundamental authentication and authorization mechanisms within a Spring Boot application.

## Installation

Clone the repository
```
git clone https://github.com/nikos-kaparos/Spring-Security-Example.git
```

## Build the project with Maven:
```
mvn clean package -DskipTests
```

## Usage
Run the containers
```bash
docker-composae up -d
```
Check the database
```bash
docker exec -it my_postgres_db psql -U myuser -d mydatabase
```
```bash
\dt
```
```bash
SELECT FROM * users;
```
Login open browser to http://localhost:8080 login note that has role based access control. So check the user in database 
## Technologies
Java 21

Maven 3.9.9

Docker 27.2.1

Docker compose 1.29.2

PostgreSQL 16.3
