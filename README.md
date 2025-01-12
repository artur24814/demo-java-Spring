# Project: First Spring Project
## Overview
This is a web project using the Java programming language and the Spring framework,
where we demonstrate how to serve an HTTP page using the Thymeleaf HTML templating engine.

## Technologies Used
* __Spring Boot__: A framework to simplify the process of building production-grade Spring applications.
* __Java__: The primary language used for development.

# Project Structure
* __FirstProjectJavaSpringApplication.java__: The entry point for the application, where Spring Boot is initialized.
* __HelloController.java__: A simple controller containing two endpoints:
  * `/`: Returns a basic greeting message "Hello Vistula in my first controller."
  * `/greeting`: Accepts a `name` parameter (optional) and returns a greeting message with that name.
## How It Works
1. __Main Application Class__:
    * The class `FirstProjectJavaSpringApplication` is the main class of the application
    that runs the Spring Boot application by invoking `SpringApplication.run()`.

2. __Controller__:
    * The HelloController contains two mappings:
       * __GET__ `/`: A simple endpoint that returns "Hello Vistula in my first controller".
       * __GET__ `/greeting`: Accepts an optional `name` query parameter
    and returns a personalized greeting message. If no name is provided, it defaults to "World".

## Endpoints
1. `/`
    * __Method__: `GET`
    * __Response__:
      ```text
      Hello Vistula in my first controller
      ```
2. `/greeting?name=John`
    * __Method__: `GET`
    * __Response__:
       ```text
       Hello, John!
       ```
3. `/greeting` __(without `name` parameter)__
    * __Method__: `GET`
    * __Response__:
      ```text
      Hello, World!
      ```
## How to Run
1. Clone the repository to your local machine.
2. Navigate to the project directory in your terminal.
3. Run the following command to start the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Open your browser or Postman, and navigate to `http://localhost:8080` to see the application in action.

## Conclusion
This simple Spring Boot application demonstrates how to set up a Spring Boot project.
