[![CircleCI](https://circleci.com/gh/varadharajaan/employee-management.svg?style=svg)](https://circleci.com/gh/varadharajaan/employee-management)

EMPLOYEE-MANAGEMENT
=========================

Building the Application
---------------------
    $ https://github.com/varadharajaan/employee-management.git
    $ cd employee

This demo assumes you know how to run Docker.
------------------------------------------------------------------------------------------------------------------------
Building the Containers
----------------------
Nothing special if you already have Docker installed:

    $ docker-compose build 


Running Containers with the docker-compose
------------------------------------------

    $ docker-compose up


------------------------------------------------------------------------------------------------------------------------ 

Actuators to check Application Health 
--------------------------------------
    $ localhost:8080/health
    $ localhost:8080/httptrace/info
------------------------------------------------------------------------------------------------------------------------ 
To consume SpringBoot app user service:
    
Consuming Rest Service
---------------------
To consume SpringBoot app user service:

    $ curl http://localhost:8080/authenticate , This will return JWT token in Response Header. 
    REQUEST : "username" : "john" 
               "password : "password  
    
------------------------------------------------------------------------------------------------------------------------

Docker push to Docker Hub Container Registry
---------------------

    $export PROJECT_ID="$(gcloud config get-value project -q)" 

    $gcloud auth configure-docker 

    $docker tag employee:latest "gcr.io/employee/employee:v1" 

    $docker push gcr.io/employee/employee:v1 

------------------------------------------------------------------------------------------------------------------------
Gitlab File
--------------

    $ Gitlab integration which go mvn install and other stages 

    $ docker build and push to docker hub

    $ Trigger terraform apply and provision environment and deploy the docker image in Google Kubernetes Cluster <br />

    $ Communication mail to all team members

------------------------------------------------------------------------------------------------------------------------
GCP Deployment using Terraform as Infrastructure as a Code
-------------------------------------

    $ Step 1: terraform init 
    $ Step 2: terraform plan 
    $ Step 3: terraform apply

------------------------------------------------------------------------------------------------------------------------
User level Authentication   ( JWT) 
--------------------------

    $ Time of User Registration, USERNAME and PASSWORD is stored in database and each time when user tries to book flight he needs to be autheticated.
    $ Also implemented Role level authorisation.

------------------------------------------------------------------------------------------------------------------------
    
Elastic Search-LogStash-Kibana  
--------------------------
    $ Implemented Dockerized version of ELK to log and index all the application logs
    $ To view generated logs on Kibana UI: [http://localhost:5601](http://localhost:5601)

Custom Log Printer
--------------------------

    $ Custom Log Printer which intercepts every request and response in Json Format

ADMIN LOGIN
--------------------------
    $ hit: localhost:8080/authenticate

     username -> john
     password -> password

    on giving incorrect password, proper error message is shown

------------------------------------------------------------------------------------------------------------------------

Above commands gives complete details of the application

##### i. Modularise :
	For the time being I have modularise the project on package level.
	Later we can also modularise in maven modules.

------------------------------------------------------------------------------------------------------------------------
##### ii. DTO :
	It stands for Data Transfer Object.
	In this project DTO are used to send as response object from rest controller.

------------------------------------------------------------------------------------------------------------------------
##### iii. RESTful API design :
	Backend consists following restful apis i.e.

	You can find all the available api's after running the application in Swagger documentation at http://localhost:8888
------------------------------------------------------------------------------------------------------------------------
##### iv. Exception Handler via Aspect :
	Added aspect for exception handling at rest layer and send appropriate http status and error messages.

------------------------------------------------------------------------------------------------------------------------
##### v. Testing and documentation for RESTful apis:
	Integrated Swagger, for more details please visit here : http://swagger.io/
	I’ve added swagger framework for testing the apis.

------------------------------------------------------------------------------------------------------------------------
##### vi. Comments :
	Entire code styling is influenced by Clean Code principle - Robert Martin
	Which says
	'Truth can only be found in one place: the code’.
	So you may not found any comments anywhere in the project.
	Keeping in mind that git can be used to manage version of file and method name should be kept as self explanatory.

	However, if you need comments on each file. I can do that too.

------------------------------------------------------------------------------------------------------------------------
##### vii. Design principles used in Project :
	a. SOLID (single responsibility, open-closed, Liskov subsitution, interface segragation, dependency inversion) principle,
	b. Composition over inheritance,
	c. DRY(Don’t repeat yourself),
	d. Test only exceptions,
	e. KISS(Keep it simple, stupid).
	f. and some experience principle ;)


select * from pte.user;
INSERT INTO `roles` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_AGENT');
select * from pte.users;
INSERT INTO pte.roles VALUES (1,'ROLE_ADMIN'),(2,'ROLE_AGENT');
INSERT INTO pte.users VALUES (1,'varathu09@gmail.com','John','Doe',NULL,'$2a$04$AKH7KONlNCThte32sIO7y.wuLJYovNumMtthBDQy00kOxT27fOvn2','john'),(2,'mike@gmail.com','Mike','Jacson',NULL,'$2a$04$AKH7KONlNCThte32sIO7y.wuLJYovNumMtthBDQy00kOxT27fOvn2','mike');
INSERT INTO pte.users_roles VALUES (1,1),(2,2);

password: password





Q2 - map
Q3 - vitamins
Q4- all are married
Q5 - summer
Q6- The Blue Elf since he's the only one that tells the truth!
Q7 - google
Q8 -  Ram and Shyam did not gave any answer.  Explanation : There is no electricity so we cannot find answer to ghost 1. There was heavy rain so we cannot find moon at night. There is no other prime number other than 2 with one of its factor as 2. Since we are provided to crack any one question of ghosts to leave we can either decide to walk in camp fire [which would have been put off due to rain] or sit in electric chair for 5 minutes [no electricity].
Q9 - Bubble Wrap 
Q11 - Cadbury
Q12 - 28 hours
Q13 - Bahubali


