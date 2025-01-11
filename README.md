# Employee Management Service
An **Employee Management System** built using **React.js**, **Spring Boot**, **MySQL**, and **Tailwind CSS**. This application demonstrates a full-stack web development approach by integrating modern front-end and back-end technologies to manage employee data effectively.

## Features
- **Create, Read, Update, and Delete (CRUD)** operations for managing employee records.
- **Responsive User Interface** designed using **Tailwind CSS**.
- **RESTful APIs** for seamless interaction between the front end and the database.
- **Efficient state management** using React hooks.
- **Integration with MySQL** for robust data storage and retrieval.
- **Spring Boot** as the backend framework for scalability and performance.

## Technologies Used
### **Frontend**
- **React.js**: To build a dynamic and responsive user interface.
- **Tailwind CSS**: For styling and ensuring a modern, responsive design.
- **Axios**: To make HTTP requests and interact with REST APIs.

### **Backend**
- **Spring Boot**: For creating a robust backend with RESTful services.
- **Spring Data JPA**: To simplify data access and mapping between Java objects and database tables.
- **Lombok**: To reduce boilerplate code by auto-generating getters, setters, constructors, etc.

### **Database**
- **MySQL**: To store and manage employee records efficiently.
- **MySQL Driver**: For establishing connections between the Spring Boot application and the MySQL database.

## Project Structure

The project is organized into two main parts: the backend (`employee-management-system-api`) and the frontend (`employee-management-system-ui`).

```plaintext
EMPLOYEE-MANAGEMENT-SERVICE/
├── employee-management-system-api/  # Backend directory
│   ├── .mvn/                        # Maven wrapper files
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/sriranjan/employee/
│   │   │   │   ├── controller/      # REST API Controllers
│   │   │   │   ├── entity/          # Entity classes for database models
│   │   │   │   ├── model/           # Additional models (DTOs, etc.)
│   │   │   │   ├── repository/      # Repository interfaces for data access
│   │   │   │   └── services/        # Business logic and services
│   │   │   ├── resources/
│   │   │   │   └── application.properties  # Application configuration
│   │   └── test/java/com/sriranjan/employee/
│   │       └── EmployeeSystemApiApplicationTests.java  # Unit tests
│   ├── mvnw                        # Maven wrapper script (Linux/macOS)
│   ├── mvnw.cmd                    # Maven wrapper script (Windows)
│   └── pom.xml                     # Maven project configuration
├── employee-management-system-ui/   # Frontend directory
│   ├── node_modules/                # Installed npm dependencies
│   ├── public/                      # Public assets
│   ├── src/
│   │   ├── components/              # React components
│   │   │   ├── AddEmployee.js       # Component to add a new employee
│   │   │   ├── Employee.js          # Employee details component
│   │   │   ├── EmployeeList.js      # Component to display a list of employees
│   │   │   ├── Navbar.js            # Navigation bar component
│   │   │   └── UpdateEmployee.js    # Component to update employee details
│   │   ├── services/
│   │   │   └── EmployeeService.js   # Service to call REST APIs
│   │   ├── App.css                  # Application-level CSS
│   │   ├── App.js                   # Main React component
│   │   ├── App.test.js              # Unit tests for the App component
│   │   ├── index.css                # Global CSS
│   │   ├── index.js                 # Entry point of the React application
│   │   └── setupTests.js            # Test configuration
│   ├── package-lock.json            # Dependency tree lock file
│   ├── package.json                 # npm project configuration
│   └── tailwind.config.js           # Tailwind CSS configuration
├── LICENSE                          # Project license
└── README.md                        # Project documentation
```

## Installation and Setup

### **Step 1: Backend Setup**
1. Clone the repository:
   ```bash
   git clone git@github.com:sriranjan06/Employee-Management-Service.git
   cd employee-management-service/employee-management-system-api
   ```

2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=root
   spring.datasource.password=admin
   ```

### **Step 2: Frontend Setup**
1. Navigate to the frontend directory:
   ```bash
   cd employee-management-service/employee-management-system-ui
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm start
   ```

### **Step 3: Access the Application**
- Open your browser and navigate to: `http://localhost:3000`

## Usage

- Add a new employee with details such as name, email, and department.
- View a list of all employees.
- Update employee details.
- Delete employee records.

## Acknowledgments

- This project was developed as part of **Shabbir Dawoodi's Full Stack Web Application Development** course.

- **Original Repository**: [shabbirdwd53/employee-management-service-tutorial](https://github.com/shabbirdwd53/employee-management-service-tutorial)