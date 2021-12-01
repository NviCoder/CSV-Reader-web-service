# Make Report From CSV file - web service 


This web service enables you to get report from csv file,
This service load the csv on startup then the service exposing endpoint (http://localhost:8080/report)

- JAVA SpringBoot
- h2 Database


## Features
The report should support two types of statistics :
- Count number of nulls for a column
- The average age

## How to insert your csv file
- Drag your csv file to the root dir of the project
- change the name of the path to your file
- run the app

## Installation

This web service requires [mavan](https://mkyong.com/maven/how-to-install-maven-in-windows/) or [java](https://mkyong.com/maven/how-to-install-maven-in-windows/) installed.

(Example for running on VS Code :  https://www.youtube.com/watch?v=dq1z9t03mXI&ab_channel=ArjunCodes)

Install the dependencies and devDependencies and start the server.

```sh
cd target
java -jar target/myapplication-0.0.1-SNAPSHOT.jar
```

With Manvan

```sh
 mvn spring-boot:run
```

## Endpoint

Verify the deployment by navigating to your server address in
your preferred browser.

```sh
http://localhost:8080/report
```
## GET /report - format exapmle

```sh
{"id":1,"averageAges":25.0,"firstNameNulls":1,"lastNameNulls":3,"ageNulls":0}
```

