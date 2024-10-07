# Java Maven CI/CD Pipeline

This project demonstrates a Continuous Integration and Continuous Deployment (CI/CD) pipeline setup using **Jenkins**, **Docker**, and **Maven** for a Java-based Maven application. The pipeline automates the building, testing, and deployment of the application.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [CI/CD Pipeline Breakdown](#cicd-pipeline-breakdown)


## Technologies Used

- **Jenkins**: An open-source automation server that facilitates setting up CI/CD pipelines to automate various stages of development.
  
- **Docker**: A containerization platform that packages applications and their dependencies into isolated environments called containers.

- **Maven**: A build automation and dependency management tool for Java projects that simplifies the build process and manages project dependencies.

- **Git**: A distributed version control system used to manage source code and track changes.

- **Dockerfile**: A script with instructions for building a Docker image for the application.


## Setup Instructions

1. **Prerequisites**:
   - Ensure you have [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed.
   - Install [Maven](https://maven.apache.org/download.cgi) for building the project.
   - Set up [Docker](https://www.docker.com/get-started) on your machine.
   - Install [Jenkins](https://www.jenkins.io/doc/book/installing/) for CI/CD.

2. **Clone the Repository**:
   ```bash
   git clone https://github.com/AsmaCherifa/TestingProgram.git
   cd TestingProgram
3. **Build the Project**:
  mvn clean package
4. **Build the Docker Image**:
docker build -t testingprogram .
5. **Run the Docker Container**:
docker run -p 8087:8087 testingprogram


## CI/CD Pipeline Breakdown
Clone Repository: Jenkins pulls the latest source code from the GitHub repository.

Build Docker Image: Jenkins builds a Docker image using the Dockerfile provided in the repository.

Run Tests: Jenkins runs unit tests using Maven inside the Docker container to ensure the application is functioning correctly.

Deploy: Jenkins deploys the application by running the Docker container, exposing it on a specified port.

## Usage
After deploying the application, you can access it at http://localhost:8087 (or the appropriate port you've specified).

## Contributing
If you'd like to contribute to this project, feel free to fork the repository and submit a pull request. Your contributions are welcome!

