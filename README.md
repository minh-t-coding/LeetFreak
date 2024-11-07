# LeetFreak

## Prerequisites

Before starting the servers, make sure you have the following installed:

### Frontend
- [Node.js](https://nodejs.org/) (version 14 or higher)
- [npm](https://www.npmjs.com/) (Node Package Manager, which comes with Node.js)

### Backend
- [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 11 or higher)
- [Maven](https://maven.apache.org/) (to manage the Spring Boot project)

## Getting Started

### 1. Install Dependencies

#### Frontend
1. Navigate to the `frontend` directory.
    ```bash
    cd frontend
    ```
2. Install the necessary npm dependencies.
    ```bash
    npm install
    ```

#### Backend
1. Navigate to the `backend` directory.
    ```bash
    cd backend
    ```
2. Ensure all dependencies are set up using Maven (Maven should automatically fetch dependencies based on your `pom.xml`).
    ```bash
    mvn clean install
    ```

### 2. Start the Servers

#### Frontend
1. Navigate to the `frontend` directory (if not already there).
    ```bash
    cd frontend
    ```
2. Run the frontend development server.
    ```bash
    npm start
    ```
   This will start the frontend on `http://localhost:3000` (or whichever port is configured).

#### Backend
1. Navigate to the `backend` directory (if not already there).
    ```bash
    cd backend
    ```
2. Run the backend server using Maven.
    ```bash
    mvn spring-boot:run
    ```
   This will start the backend server on `http://localhost:8080` (or the configured port).

### 3. Access the Application
Once both servers are running, you can access the full application by opening your browser and navigating to:

- Frontend: [http://localhost:3000](http://localhost:3000)
- Backend (API): [http://localhost:8080](http://localhost:8080)

---

Feel free to contribute or reach out if you encounter any issues during setup or usage!
