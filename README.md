# Microservices Project

This is a collection of microservices that together form a school system.

## Services

- Config Server: Centralized configuration server.
- Discovery Service: Eureka discovery service for service registration and discovery.
- Gateway Service: Gateway service for routing requests to appropriate services.
- School Service: Service handling operations related to schools.
- Student Service: Service handling operations related to students.

## Technologies Used

- Java
- Spring Boot
- Spring Cloud
- Maven
- PostgreSQL

## Setup

### Prerequisites

- Java 21
- Maven
- PostgreSQL

### Installation

1. Clone the repository
2. Navigate to each service directory
3. Run `mvn clean install` to build each service
4. Run `mvn spring-boot:run` to start each service

## Configuration

Each service can be configured via its respective `application.yml` file. Here you can set the server port, database connection details, Eureka service URL, and other settings.

