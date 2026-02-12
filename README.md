# microservices-bookstore
uisng the microservices implemented the book store with the 3 services-- userservice ,orderservice and the payment service

🚀 Project Overview

This project is a Microservices-based Book Store Application developed using Spring Boot (backend) and React (frontend).

The system allows users to:

Browse books

Add books to cart

Place orders

Make payments

Track order status

The architecture follows microservices principles, where each service is independently deployable and communicates via REST APIs.

🏗️ Microservices Architecture

The application is divided into the following services:

🔹 1. API Gateway

Single entry point for all client requests

Routes requests to appropriate microservices

Performs JWT validation

Load balances requests

🔹 2. Eureka Server (Service Registry)

Registers all microservices

Enables dynamic service discovery

Allows API Gateway to locate services

🔹 3. Auth Service

User registration & login

Generates JWT tokens

Handles authentication & authorization

🔹 4. Book Service

Manages book catalog

CRUD operations for books

Stores book details in MySQL

🔹 5. Product Service

Manages product availability & stock

Handles inventory updates

🔹 6. Order Service

Creates and manages user orders

Communicates with Payment Service

Updates order status

🔹 7. Payment Service

In-house payment simulation

Processes payments

Updates payment & order status

🔐 Security Implementation

JWT-based Authentication

Role-based Authorization

Secure REST APIs

Token validation at API Gateway level

🛠️ Tech Stack
Backend

Spring Boot

Spring Cloud

Spring Security

Spring Data JPA

Eureka Server

API Gateway

MySQL

# Frontend

React

Axios

React Router

# 🔄 Application Flow

User logs in → JWT token generated.

User browses books.

Adds books to cart.

Places order.

Order Service communicates with Payment Service.

Payment confirmed → Order status updated.

# 📊 Key Features

✔ Microservices Architecture
✔ Service Discovery (Eureka)
✔ API Gateway Routing
✔ JWT Authentication
✔ Independent Databases
✔ RESTful Communication
✔ Payment & Order Integration
✔ Full CRUD Operations


Client → API Gateway → Eureka Lookup → Target Microservice → Database


