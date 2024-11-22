# **Tow Truck Backend - Spring Boot Application**

### **Overview**
This is the backend system for the **Tow Truck Web Application**, built using Spring Boot. It handles service request management, vehicle tracking, and status updates for towing services. It provides RESTful APIs to interact with the database and supports integration with frontend clients or third-party tools like Postman.

---

### **Features**
- RESTful APIs for CRUD operations on service requests.
- Integration with MySQL for persistent data storage.
- Easy testing with Postman or other API testing tools.
- Modular and scalable architecture using Spring Boot.

---

### **Technologies Used**
- **Framework**: Spring Boot
- **Language**: Java
- **Database**: MySQL
- **Tools**: Maven, Postman, Git

---

### **Database Schema**
#### **Service Request Table**
```sql
CREATE TABLE service_request (
    id INT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(255),
    request_time DATETIME,
    service_type VARCHAR(50),
    status VARCHAR(50),
    vehicle_details VARCHAR(255)
);
## API Endpoints

| Method | Endpoint               | Description                       |
|--------|-------------------------|-----------------------------------|
| GET    | /api/requests           | Get all service requests         |
| GET    | /api/requests/{id}      | Get a specific service request   |
| POST   | /api/requests           | Create a new service request     |
| PUT    | /api/requests/{id}      | Update an existing service request |
| DELETE | /api/requests/{id}      | Delete a service request         |
