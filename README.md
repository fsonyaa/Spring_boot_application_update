# 🌸 Spring Boot + PostgreSQL + pgAdmin Project

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green?logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?logo=postgresql)
![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow)

---

## 🧩 Description

Ce projet est une application **Spring Boot** connectée à une base de données **PostgreSQL**, administrée via **pgAdmin**.  
Il met en œuvre les bonnes pratiques de configuration, de persistance des données (JPA/Hibernate) et de gestion des dépendances Maven.

---

## ⚙️ Configuration de la base de données

Fichier : `src/main/resources/application.properties`

```properties
# ===============================
# ⚙️ CONFIGURATION BASE DE DONNÉES
# ===============================
spring.datasource.url=jdbc:postgresql://localhost:5432/pv_db
spring.datasource.username=postgres
spring.datasource.password=123
spring.datasource.driver-class-name=org.postgresql.Driver

# ===============================
# 🧱 JPA / HIBERNATE
# ===============================
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

# ===============================
# 🕊️ FLYWAY
# ===============================
spring.flyway.enabled=false

# ===============================
# 🌐 SERVER
# ===============================
server.port=8080

##Test sur postman :http://localhost:8080/api/agencies
