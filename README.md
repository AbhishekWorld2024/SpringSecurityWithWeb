# SpringSecurityWithWeb
<h1>Spring Boot Security with In-Memory Authentication</h1><br><br>
This project demonstrates a  Spring Boot application with in-memory authentication using Spring Security. It showcases how to secure specific endpoints and render a custom HTML page upon successful login.<br><br>
**Features**<br>
**In-Memory Authentication:**<br>

Configures two users, abhi with a USER role and Sandy with an ADMIN role.<br>
Passwords are encoded with BCrypt, enhancing security for in-memory stored credentials.<br><br>
**Endpoint Security Configuration:**<br>

/UserDetails endpoint is secured and requires authentication.<br>
Access to the /UserDetails page requires login credentials, which are verified against the in-memory user store.<br>
A form-based login is configured, with successful logins redirected to the UserDetails HTML page.<br><br>
**Custom Configurations:**<br>

The application is accessible on port 8102 and uses .jsp files from the /page/ directory for rendering views.<br>
application.properties sets up custom prefixes and suffixes for JSP views.<br><br>
**HTML Page:**<br>

A basic HTML page, UserDetails.jsp, contains an introduction to Abhishek Arugonda’s profile, technical skills, educational background, and work experience.<br><br>
**Testing:**<br>

Verified via Postman to check for endpoint security and access permissions.<br><br>
**How It Works**<br>
Start the application and navigate to localhost:8102/UserDetails.<br>
Enter credentials as configured (abhi/abhi@1 or Sandy/Sandy@1).<br>
Upon successful login, you will be redirected to the UserDetails page, displaying profile and experience information.<br><br>
**Code Structure**<br>
**Controller Class (AbhiController):**<br>
Contains the endpoint for UserDetails, mapped to return the UserDetails.jsp view.<br><br>

**Configuration Class (configclass):**<br>

Defines UserDetailsService with in-memory users.<br>
Sets up SecurityFilterChain to protect the /UserDetails endpoint.<br>
Configures form-based login and sets a default success URL for authenticated users.<br><br>
**Project Setup**<br>
Spring Boot with Spring Security for authentication.<br>
BCryptPasswordEncoder for secure password encoding.<br>
JSP view rendering from the /page/ directory.<br>
Running the Application<br>
Clone the repository and open the project in your IDE.<br>
Run the application.<br>
Access the secured page at localhost:8102/UserDetails.<br><br>
**Log in with credentials:**<br>
Username: abhi, Password: abhi@1<br>
Username: Sandy, Password: Sandy@1<br><br>
**Technologies Used**<br>
Spring Boot<br>
Spring Security<br>
BCryptPasswordEncoder<br>
JSP<br><br>
**Postman (for testing)**<br>
This setup provides a foundation for understanding Spring Security’s in-memory authentication and endpoint protection, useful for securing small-scale applications and learning Spring Security basics.<br>
