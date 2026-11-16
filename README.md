# Card Account Rewards Service

A minimal Spring Boot microservice scaffold for card account rewards, built with Java 21 and Maven.

## Requirements

- Java 21
- Maven 3.9 or later
- Docker (optional)

## Run locally

```bash
mvn spring-boot:run
```

The service starts on `http://localhost:8080`.

## Health endpoint

```http
GET /api/v1/health
```

Example response:

```json
{
  "status": "UP",
  "timestamp": "2025-01-01T00:00:00Z"
}
```

## Run tests

```bash
mvn clean test
```

## Build and run with Docker

Build the image:

```bash
docker build -t card-account-rewards-service .
```

Run the container:

```bash
docker run --rm -p 8080:8080 card-account-rewards-service
```

## Project structure

```text
src/
├── main/
│   ├── java/com/neura/central/cardaccountrewards/
│   │   ├── config/       # Application configuration
│   │   ├── controller/  # REST API endpoints
│   │   ├── dto/         # Request and response data transfer objects
│   │   ├── exception/   # Exceptions and global API error handling
│   │   ├── model/       # Domain models
│   │   └── service/     # Business services
│   └── resources/
│       ├── application.yml
│       ├── application-dev.yml
│       └── application-prod.yml
└── test/
    └── java/             # Unit and integration tests
```

The `dev` profile is active by default. Select another profile with:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```
