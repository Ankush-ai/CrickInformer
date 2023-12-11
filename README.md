# CrickInformer: Java Spring Boot Project Documentation

## Overview

**CrickInformer** is a backend project developed using the Spring Boot framework, designed to provide real-time information about cricket matches. The project leverages various dependencies to achieve its functionality, including Spring Web for RESTful web services, MySQL driver for database connectivity, Lombok for reducing boilerplate code, Spring Data JPA for data access, and Jsoup for web scraping.

## Project Structure

The CrickInformer project is organized into several packages, each serving a specific purpose:

- **Controller:** Handles incoming HTTP requests and manages the flow of data between the client and the application.

- **Entities:** Defines the data models that represent the structure of the information stored in the application.

- **Services:** Contains the business logic responsible for processing client requests, interacting with external sources through web scraping, and updating the database.

- **Repository:** Manages the communication between the application and the database by providing methods to perform CRUD (Create, Read, Update, Delete) operations.

- **etc:** May include additional packages or classes based on specific project requirements.

## Dependencies

The project relies on the following dependencies to achieve its functionality:

- **Spring Web:** Enables the development of RESTful web services, allowing the project to handle client requests and provide responses.

- **MySQL Driver:** Facilitates the interaction between the Spring Boot application and the MySQL database.

- **Lombok:** Reduces boilerplate code by automatically generating common code constructs such as getters, setters, and constructors.

- **Spring Data JPA:** Simplifies data access through the use of Java Persistence API annotations, providing an abstraction layer over the database.

- **Jsoup:** A Java library for parsing HTML documents and extracting information, allowing the project to perform web scraping for real-time cricket match details.

## Functionality

### Request Processing Flow

1. **Client Request:** Initiates the process by sending an HTTP request to the appropriate endpoint.

2. **Controller:** Receives the incoming request and delegates the processing to the corresponding service.

3. **Service:** Contains the core business logic. It may involve interacting with external sources, such as web scraping with Jsoup, to gather real-time cricket match information.

4. **Entities and Repository:** Manage the interaction with the database. The service updates the database with the latest information obtained from web scraping.

5. **JSON Response:** Generates a JSON response containing live cricket match details, points table, or any other requested information.

6. **Client Response:** Sends the JSON response back to the client, completing the request-response cycle.

### Web Scraping

- The project uses Jsoup for web scraping to extract live details of cricket matches from external sources.

- Web scraping involves fetching HTML content, parsing it, and extracting relevant information about ongoing matches.

- Extracted information is then used to update the database and respond to client requests.

## Conclusion

**CrickInformer** efficiently combines Spring Boot's capabilities with web scraping to provide real-time cricket information to clients. The organized project structure and use of dependencies contribute to a scalable and maintainable solution for delivering accurate and timely updates on cricket matches.

#Outputs
![Screenshot 2023-12-11 200816](https://github.com/Ankush-ai/CrickInformer/assets/83574516/a36c8f29-9801-4128-8b00-0bc7e0c65d99)
![Screenshot 2023-12-11 200840](https://github.com/Ankush-ai/CrickInformer/assets/83574516/9b8f3c71-b971-445e-b2ec-cf8eb149c402)
![Screenshot 2023-12-11 200635](https://github.com/Ankush-ai/CrickInformer/assets/83574516/036e3b49-a9d4-4890-a24a-2a5cf97d7955)
![Screenshot 2023-12-11 200731](https://github.com/Ankush-ai/CrickInformer/assets/83574516/39a570d6-7ea6-4ee1-8506-71fe994072ab)







