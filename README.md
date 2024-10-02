<h1 align="center" style="font-weight: bold;">Agente de Eventos 💻</h1>
<h1 align="center" style="font-weight: bold;">In Progress...🚧</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
  <a href="#nexts">Next Steps</a> •
</p>

<p align="center">
This project is a system for managing in-person events. It allows the sale of tickets with QR codes, which will be scanned at the entrance of the event to control participant access. The system provides a comprehensive overview of the event, mapping how many tickets have been sold, how many people have entered, and offers complete control of occupancy and event organization in real-time.
</p>

<h2 id="technologies">💻 Technologies</h2>

- Sping ( Boot, Cloud, JPA, Web, Security)
- Java
- Postgress
- Flyway
- Amazon Web Services (Aws) - RDS/EC2
- Docker
- JWT authorization

<h2 id="started">🚀 Getting started</h2>

<ol>
    <li><strong>Create a New PostgreSQL Database on AWS:</strong>
        <p>To set up a PostgreSQL database, you will need an AWS account. Create a new database using the Amazon RDS service:</p>
        <pre><code>1. Log in to your AWS Management Console.
2. Navigate to the RDS service.
3. Click on "Create database".
4. Select "PostgreSQL" as the database engine and follow the prompts to configure your database.</code></pre>
    </li>
    <li><strong>Run Flyway Migrations:</strong>
        <p>Execute the Flyway migrations to set up the database schema. This is typically handled automatically upon application startup if configured correctly.</p>
    </li>
</ol>


<h3>Pre requisites</h3>
To run the project with the mentioned technologies, you will need to have installed:

- Java Development Kit (JDK) (version 21)
- Node.js
- PostgreSQL (server and client)
- DBeaver or similar
- Docker
- AWS CLI (optional, for interacting with AWS)

<h3>Cloning</h3>

How to clone your project

```bash
git clone (https://github.com/Amandalcosta33/AgenteDeEventos.git)
```

<h3>Config .env variables</h2>

Use the this as reference to create your configuration file `application.properties` with your AWS Credentials

```yaml
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
```

<h3>Starting</h3>

#### How to start your project
---
```bash
# Install maven dependencies
mvn install
# Run application
mvn spring-boot:run
```
---
#### Run with docker
```bash
# Build docker
$ docker build -t <conteiner'sname> . 
# Run no docker on port 8080
$ docker run -p 8080:8080 -t <conteiner'sname>
```
---
---
####  Você pode acessar a documentação pelo swagger
```bash
$ http://localhost:8080/swagger-ui/index.html#/
```
---

<h2 id="nexts">Next Steps </h2>

Checklist ✅
- [x] Create the project
- [x] Map the entities
- [x] Run database migrations using Flyway
- [x] Add to Docker
- [ ] Add kubernetes
- [ ] Create all necessary controllers + services + repositorys
- [ ] Write unit tests using JUnit + Mockito
- [x] Add swagger as Api documentation
- [x] Add authorizer with JWT


 
