# HealthSafe

Enterprise healthcare integration service built with Spring Boot. Exposes RESTful
APIs for managing patients, doctors, and appointments.

## Stack

- Java 17
- Spring Boot 3.5.5 (Web, Validation, Data JPA)
- H2 (in-memory, for now — swap for Postgres/MySQL in `application.properties`)
- Maven

## Running locally

```bash
mvn spring-boot:run
```

The service starts on `http://localhost:8080`.

## Endpoints

| Method | Path            | Description                     |
|--------|-----------------|----------------------------------|
| GET    | `/health`       | Service health check             |
| GET    | `/patients`     | List all patients                |
| POST   | `/patients`     | Create a patient                 |
| GET    | `/doctors`      | List all doctors                 |
| POST   | `/doctors`      | Create a doctor                  |
| GET    | `/appointments` | List all appointments            |
| POST   | `/appointments` | Create an appointment            |

Creating an appointment validates that `patientId` and `doctorId` reference
existing records; unknown IDs return `404`. Validation failures (e.g. missing
required fields) return `400` with a message body.

## Notes

Patients, doctors, and appointments are currently held in-memory (reset on
restart). JPA/H2 is wired up and ready for the models to be converted to
`@Entity` classes backed by Spring Data repositories.
