# API Shield Platform

A real-world API management system built using Spring Boot and WSO2 API Manager. This project demonstrates how an API Gateway can be used to secure, publish, and manage backend REST APIs in a microservices-style architecture.

---

## 🚀 Tech Stack

- Spring Boot (REST API backend)
- WSO2 API Manager 4.7.0 (API Gateway & Management)
- Docker & Docker Compose
- Java 17
- REST APIs (JSON)

---

## 🏗️ Architecture
```text
Client → WSO2 API Manager → Spring Boot API → Response
```



- Spring Boot handles business logic
- WSO2 API Manager handles:
    - API publishing
    - Authentication (OAuth2/JWT)
    - Rate limiting
    - API analytics
    - API lifecycle management

---

## 📦 Features

- RESTful API built with Spring Boot
- API exposure via WSO2 API Gateway
- API subscription and key generation
- API throttling and security policies
- Dockerized environment
- Clean separation of backend and API gateway

---

## 🐳 Run with Docker

### 1. Clone repository
```bash
git clone https://github.com/sajith-jeewantha/api-shield-platform.git
cd api-shield-platform
```

### 2. Start system

```bash
docker compose up --build
```
### 🌐 Access URLs

| Service               | URL                                                                  |
| --------------------- | -------------------------------------------------------------------- |
| WSO2 Publisher        | [https://localhost:9443/publisher](https://localhost:9443/publisher) |
| WSO2 Developer Portal | [https://localhost:9443/devportal](https://localhost:9443/devportal) |
| Gateway               | [https://localhost:8243](https://localhost:8243)                     |
| Spring Boot API       | [http://localhost:8080](http://localhost:8080)                       |

### 🔌 API Flow

1. Start Spring Boot service
2. Run WSO2 API Manager in Docker
3. Create API in Publisher Portal
4. Set backend endpoint:

```bash  
http://spring-api:8080
```
5. Publish API
6. Subscribe and test via Developer Portal

### 📂 Project Structure

```text 
api-shield-platform/
│
├── docker-compose.yml
├── README.md
├── .gitignore
│
├── apim/
│   └── deployment.toml
│
├── springboot-api/
    ├── Dockerfile
    ├── src/
    └── target/
```

[//]: # (│)

[//]: # (└── docs/)

[//]: # (└── screenshots/)

### 🎯 Learning Outcomes
- API Gateway concepts
- Microservice architecture
- API lifecycle management
- Docker containerization
- Secure API exposure
- Enterprise integration patterns

### 📜 License
This project is licensed under the Apache License 2.0
