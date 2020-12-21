# SpringBoot-Web Application

 - Spring boot web app added with spring MVC.
 - Spring data in boot application, spring security

 URL : http://localhost:8080/rooms, http://localhost:8080/api/rooms

Actuator Url's : http://localhost:8080/health, http://localhost:8080/env, http://localhost:8080/info
Note: Giving the actuator role to someone is critical so keep in mind.

- Health endpoint (http://localhost:8080/health)
- Metrics endpoint (http://localhost:8080/metrics)
- Adding custom endpoints
- Audit endpoints: http://localhost:8080/auditevents (useful in case your application deals with financial data)
- Auto config: http://localhost:8080/autoconfig (Gives you all spring boot configuration information)
- When troubleshooting the application: http://localhost:8080/beans
- Application using all the properties: http://localhost:8080/configprops
- Application : http://localhost:8080/dump
- http://localhost:8080/loggers
- http://localhost:8080/mappings