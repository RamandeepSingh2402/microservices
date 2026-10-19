What is a web service?
It's not just a service delivered over the web.

W3C definition: Software system designed to support interoperable machine-to-machine interaction over a network.

Three key items:
- Designed for machine to machine (or application to application) interaction
- Should be interoperable (not platform dependent)
- Should allow communication over a network

SOAP vs RESTful Web services:


SOAP Web services use SOAP-XML as request and response format.
In SOAP-XML, we have envelope, header and body {request and response is contained in the SOAP body}

REST Web Services are built on top of HTTP, use HTTP methods (GET, POST, DELETE, ...) for executing operations
- Retrieve Todos for a user -> GET /users/Ranga
- Create a new user -> POST /users
- Delete a user -> DELETE/users

Building REST API with Spring Boot - Goals:
- Why Spring Boot?
  - You can build REST API WITHOUT Spring Boot
  - What is the need for Spring Boot?

- How to build a great REST API?
  - Identifying Resources (/users, /users/{id}/posts)
  - Identifying Actions (GET, POST, PUT, DELETE, ...)
  - Defining Request and Response structures
  - Using appropriate Response Status (200, 404, 500, ....)
  - Understanding REST API Best Practices
    - Thinking from the perspective of your consumer
    - Validation, Internationalization - i18n, Exception Handling, HATEOAS, Versioning, Documentation, Content Negotiation and a lot more



- How are our requests handled?
 - DispatcherServerlet: Front Controller Pattern
  - Mapping servlets: dispatcherServerlet urls=[/]
  - Auto Configuration (DispatcherServletAutoConfiguration)

 - How does HelloWorldBean object get converted to JSON?
  - @ResponseBody + JacksonHttpMessageConverters
   - Auto Configuration (JacksonHttpMessageConvertersConfiguration)

 - Who is configuring error-mapping??
  - Auto Configuration (ErrorMvcAutoConfiguration) 

 - How are all jars available (Spring, Spring MVC, Jackson, Tomcat)?
  - Starter Projects - Spring Boot Starter Web (spring-webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)

