# Tanhu Multi

Tanhu Multi is a multi-module Spring Boot project that demonstrates how to structure and manage multiple microservices within a single Maven project.

## Video Explanation

Check out the detailed explanation of this project on YouTube: [https://youtu.be/Qv7rIGtf38M](https://youtu.be/Qv7rIGtf38M)

## Overview

This project consists of:
- A **parent module (`tanhu-multi`)** that defines dependencies and configurations for all submodules.
- Two **microservices**:
    - `service-write`: A Spring Boot microservice that exposes a simple REST endpoint.
    - `service-read`: Another Spring Boot microservice with a similar setup.

Each microservice is structured as a standalone Spring Boot application and packaged as a JAR. The project follows a modular approach, making it easier to manage and scale.

## Project Structure

```
 tanhu-multi
 ├── pom.xml (Parent POM)
 │
 ├── service-read
 │   ├── src/main/java/... (Source code for service-read)
 │   ├── pom.xml (Defines dependencies and plugins for service-read)
 │
 ├── service-write
 │   ├── src/main/java/... (Source code for service-write)
 │   ├── pom.xml (Defines dependencies and plugins for service-write)
```

## Dependencies

- `spring-boot-starter-web`: Enables REST API development.
- `spring-boot-maven-plugin`: Helps in building and running Spring Boot applications.

## Getting Started

### Prerequisites

Before running the project, ensure you have the following installed:
- **JDK 21**
- **Maven**

### Build and Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/tanhu-multi.git
   cd tanhu-multi
   ```

2. **Build the project:**
   ```sh
   mvn clean install
   ```

3. **Run each microservice:**
   ```sh
   cd service-write
   mvn spring-boot:run
   ```
   Open a new terminal for `service-read`:
   ```sh
   cd service-read
   mvn spring-boot:run
   ```

4. **Access the endpoints:**
    - `service-write`: [http://localhost:8500/api/v1/writers](http://localhost:8500/api/v1/writers)
    - `service-read`: [http://localhost:8600/api/v1/readers](http://localhost:8600/api/v1/readers)

## Contributing

Feel free to fork the repository and submit pull requests for improvements.

---

For any questions, reach out via GitHub Issues.

