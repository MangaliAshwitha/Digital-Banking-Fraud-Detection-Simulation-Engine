Project Overview

The Digital Banking Fraud Detection & Simulation Engine is designed to simulate banking transactions, detect fraudulent patterns, and support future integration with rule-based and ML-based anomaly detection.

This repository currently includes Milestone 1, which covers environment setup, API configuration, database modeling, and initial fraud scenario definitions.

🎯 Milestone 1 Objectives

Milestone 1 focuses on building the foundational elements of the system:

✔️ Project Environment Setup

Spring Boot project created

Necessary dependencies added

MySQL database configured

REST API layer enabled

✔️ Data Model Creation

Transaction Entity designed

Fields added to support basic and fraud-related metadata

✔️ Initial API Setup

A POST API endpoint created to receive transactions

Basic validation included

Data stored in MySQL database

✔️ Fraud Scenario Definitions

These initial rule-based fraud indicators are prepared for further use:

High-Value Transaction

Unusual Login Location

Multiple Active Devices

Frequent Password Changes

Suspicious Merchant Behavior

These rules are not fully implemented yet but prepared for Milestone 2.

🛠️ Tech Stack
Component	Technology
Backend Framework	Spring Boot
Programming Language	Java
Database	MySQL
ORM	Spring Data JPA
Build Tool	Maven
API Format	REST (JSON)
📂 Project Structure (Milestone 1)
transaction-api
└── src
    └── main
        ├── java
        │   └── com.example.transaction_api
        │       ├── Transaction.java
        │       ├── TransactionController.java
        │       ├── TransactionRepository.java
        │       ├── TransactionGenerator.java
        │       └── TransactionApiApplication.java
        └── resources
            ├── application.properties
            └── static / templates (empty for now)

🧪 Transaction Submission Flow (Milestone 1)
1️⃣ Transaction Generator creates sample transaction

Random UUID

Amount

Timestamp

User

Fraud-related metadata

2️⃣ REST API receives the transaction

POST /transaction

3️⃣ Validation

Checks required fields

Basic rules (amount > 0, user exists, etc.)

4️⃣ Save into MySQL

Table generated automatically using JPA.

🔗 Sample API Request
{
  "transactionId": "a12f-45ds-908s",
  "amount": 1200.50,
  "user": "Ashwitha",
  "status": "SUCCESS",
  "timestamp": "2025-12-07T10:22:10",
  "activeDevices": 3,
  "deviceId": "MOBILE_9821",
  "location": "HYD",
  "merchantId": "MRC992",
  "passwordChangedRecently": false
}


                      ┌─────────────────────────┐
                      │  Transaction Generator   │
                      │ (Simulates Transactions) │
                      └──────────────┬──────────┘
                                     │  POST JSON
                                     ▼
                       ┌─────────────────────────┐
                       │   Spring Boot API       │
                       │  /transaction endpoint  │
                       └──────────────┬──────────┘
                                     │ Validates Data
                                     ▼
                      ┌────────────────────────────┐
                      │  Validation Layer           │
                      │  - Amount rules             │
                      │  - Required fields check    │
                      │  - Basic fraud indicators   │
                      └──────────────┬─────────────┘
                                     │ If valid
                                     ▼
                   ┌──────────────────────────────────┐
                   │     Transaction Repository (JPA) │
                   └─────────────────┬────────────────┘
                                     │ Saves Entity
                                     ▼
                         ┌─────────────────────────┐
                         │       MySQL DB          │
                         │  transaction table       │
                         └─────────────────────────┘



📂 Project Structure
src/main/java/com/example/transaction_api
│
├── Transaction.java
├── TransactionController.java
├── TransactionGenerator.java
├── TransactionRepository.java
└── TransactionApiApplication.java



👩‍💻 Author
 Mangali Ashwitha
B.Tech IT – Digital Banking Fraud Simulation Project
