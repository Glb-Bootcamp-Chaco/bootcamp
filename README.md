# Welcome to the Code Your Future "Bootcamp" for Globers!

Please, use this repository as a base for your training. 
The idea is to fork this project so everyone use the same folder structure for the exercises.

# Material
  
## Index

1. [Objective](#objective)

2. [Who Should Attend](#who-should-attend)

3. [Duration](#duration)

4. [Technical Assistance](#technical-assistance)

5. [Performance Measurement](#performance-measurement)

6. [Materials](#materials)

7. [General Guidelines](#general-guidelines)

8. [Proposed Test Application](#proposed-test-application)

9. [Learning Days](#learning-days)

    * [Topic 0: Introduction to Java and Object Oriented Programming Concepts](topic-0-introduction-to-java-and-object-oriented-programming-concepts)
    * [Topic 1: Design and Development Principles](#topic-1-design-and-development-principles)
    * [Topic 2: Application Building using Maven](#topic-2-application-building-using-maven)
    * [Topic 3: Unit Testing with JUnit and Mockito](#topic-3-unit-testing-with-junit-and-mockito)
    * [Topic 4: Introduction to the Spring Framework](#topic-4-introduction-to-the-spring-framework)
    * [Topic 5: REST Application Design with Spring Boot](#topic-5-rest-application-design-with-spring-boot)
    * [Topic 6: Database Interaction and ORMs with Spring Data](#optional-topic-database-interaction-and-orms)


## Objective

This course teaches the basics of Java development and the tools and frameworks that surround it.

→ [index](#index)

## Who Should Attend

The training will start at a low level and does not require in depth knowledge of the platform in question. Desirable participant profile: Globant trainees with a basic knowledge on OOP and a lot of energy!

→ [index](#index)

## Duration

Four weeks total, where we are going to mix reading, coding practice, chat discussions and Meet/Zoom talks.

→ [index](#index)

## Technical Assistance

You can contact other participants or any available trainer if you need technical assistance. We will have a [Slack](https://www.youtube.com/watch?v=9RJZMSsH7-g)'s channels to discuss all together.

→ [index](#index)

## Performance Measurement

When you feel like you are good to go with a practice code, let trainers know and ask for review. This is to avoid getting to the very end of the training with no feedback. The idea is to keep things going dinamically, and being constantly in contact. 

→ [index](#index)


## Materials

1. Install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

2. The IDE to use is [IntellIJ IDEA] (https://www.jetbrains.com/es-es/idea/download/). Community version  is enough for Bootcamp completion.

3. [Download](https://slack.com/downloads) and install Slack's application. You will receive an invitation in your email to join to Slack's workspace *glb-bootcamp-chaco* or just sign in to https://glb-bootcamp-chaco.slack.com and join the channel #general
, please updated your profile picture with your face!

4. Create your own [GitHub](https://github.com/) account. Follow this [guideline](https://help.github.com/articles/set-up-git) to setup your account. Also you can read further about Git in [Try Git](https://try.github.io/levels/1/challenges/1) or [Learn Git Branching](http://pcottle.github.io/learnGitBranching/)

5. Fork this repo to use as a base to host the project code. Read [this](https://help.github.com/articles/fork-a-repo/) for instructions.
6. Each Topic Practice should be commited into a folder with <*your_name>/topic<#>*. Example: ***pepito_perez/topic0***
→ [index](#index)

 

## General Guidelines

The Code Your Future bootcamp is organized in the following way:

each trainee needs to read about the topics and jump into the coding excercises. An a Slack's channel by topic will be used to discuss with tutors and co-trainees about both theory and practice, and each on-site talk we are going to go through the outcome of Slack channel discussions, emphasizing about those topics that are causing more pain for all.

Globant Workspace Slack's account would be used for technical assistance:
>#glb-bootcamp-chaco

Every person participating in the bootcamp is present here (trainees and trainners). Here is the place to ask for technical assistance!

[Team play](http://www.dummies.com/how-to/content/ten-qualities-of-an-effective-team-player.html) is encouraged but the work will be evaluated per person.

The instructions will be vague as they generally are in real life projects. You must look for support and guidance from your traineers and teammates.

All code and documentation must be in English.

→ [index](#index)

## Learning Days

Each day you will grab the fundamentals of the key building blocks for usual Java applications.

On each learning day you will have to:

1. ####Read:####
We will provide you with documentation so you can have a background reference, guide and examples to complete the following practice.

2. ####Practice:####
You will implement the previously gathered knowledge in simple coding activities. You will do the effort to have the best results and be ready to apply this knowledge in the final project. Each of this steps are not going to be evaluated though, it's the learning mechanism to get the bests results at the end of the training.

3. ####Commit:####
You will commit all your code as soon as you finish your practice. No rush, but ideally enough commits to have questions to discuss through slack and for the next talk.

# Topic 0: Introduction to Java and Object Oriented Programming Concepts

## Reading:

1. [JVM](http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html#t1s1). See: "Java Technology and the JVM"
2.  Java Concepts [basic tutorial](http://docs.oracle.com/javase/tutorial/java/concepts/)

## Practice

 -  Make some exercises listed [here](https://www3.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html) and [here](https://www.w3resource.com/java-exercises/basic/index.php) .
 -  Have fun with [Intro to Java](http://www.ibm.com/developerworks/java/tutorials/j-introtojava1/). 
 
 ## Topic Practice
Go to Topic 0 resources, check folder *Topic0JavaBootCamp/src*, you will find a basic structure of a Java Project, with an initial application abstraction. Import these files to your IntelliJ IDEA's project. You have to build a Java Application using all OOP concepts. You have to make a Farm, with a Farmer and a Hen House with 40 Hens, 70% of Heans lay Red Eggs and 30% Heans lay White Eggs, each Hen will lay 2 eggs per day. Your Farmer have to recolect them inside an Egg's Carton, each Egg's Carton (6 x 5) has a capacity for 30 eggs and it will be classified them by color. 

### Expected Result

- Egg's Cartons Console representation in 1 day. e.g.
*(O)*: white eggs
*(D)*: red eggs
*(G)*: empty<br/> 
===========\
(O)(O)(O)(O)(O)\
(O)(O)(O)(O)(O)\
(O)(O)(O)(O)(O)\
(O)(O)(O)(O)(O)\
(O)(O)(O)(O)(O)\
(O)(O)(O)(G)(G)\
===========\
(D)(D)(D)(D)(D)\
(D)(D)(D)(D)(D)\
(D)(D)(D)(D)(D)\
(D)(D)(D)(D)(D)\
(D)(D)(D)(D)(D)\
(D)(D)(G)(G)(G)

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Topic 1: Design and Development Principles
## Reading
### Common Design Patterns used in Java Project

Explore [Design Patterns](https://www.oodesign.com/). Don't go crazy on this reading, the idea is to know they exist, and when we discuss about them, we'll see why they exist. 

Understand that there are zillions, so take it easy but do take the time to have an overview of them.

Ideally, let's make the time to get familiar with the basics of the following:

+ [Singleton](https://sourcemaking.com/design_patterns/singleton) 
+ [Factory](https://sourcemaking.com/design_patterns/factory_method)
+ [Abstract Factory](https://sourcemaking.com/design_patterns/abstract_factory)
+ [Builder](https://sourcemaking.com/design_patterns/builder)
+ [Decorator](https://sourcemaking.com/design_patterns/decorator)

## Topic Practice:
Improve your Farm Java Application applying these basic design patterns

# Topic 2: Application Building Using Maven

## Reading:
1. [What is Maven?](http://maven.apache.org/what-is-maven.html)

2. Have fun with [Maven in 5 minutes](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html). 

3. Maven: [best practices](http://books.sonatype.com/mvnref-book/reference/pom-relationships-sect-pom-best-practice.html)

4.  Log4j: [What it is?](https://www.java4s.com/log4j-tutorials/)

## Topic Practice:

(It is assumed that Maven is already installed and working).

1. Convert you current Farm Java Project into a Maven Project, [see](https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html).
2. Customize the Maven project by adding new dependencies: log4j, junit.
3. Configure log4j in your application and add some log staments inside it.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Topic 3: Unit Testing with JUnit and Mockito

## Reading:
1. [Benefits of Unit Testing](https://dzone.com/articles/top-8-benefits-of-unit-testing)
2. [JUnit](https://junit.org/junit4/cookbook.html)
3. [Mockito](https://site.mockito.org/)
4. [Difference Between Mocks and Stubs](https://martinfowler.com/articles/mocksArentStubs.html)
5. [Optional, good to know its existence though] [Test Driven Development](http://technologyconversations.com/2013/12/24/test-driven-development-tdd-best-practices-using-java-examples-2/)

## Topic Practice:

1. Implements all unit test cases in JUnit for the methods implemented in the farm application.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Topic 4: Introduction to the Spring Framework

## Reading:

1. [Spring Framework Fundamentals](https://o7planning.org/en/10127/spring-tutorial-for-beginners)
2. [Spring MVC](https://o7planning.org/en/10129/spring-mvc-tutorial-for-beginners)
3. [Spring Framework Projects](https://www.baeldung.com/org-springframework)

## Topic Practice
Transform your Farm Application into a Spring Project

→ [index](#index)

# Topic 5: REST Application Design with Spring Boot

 1. [What's HTTP?](https://code.tutsplus.com/tutorials/http-the-protocol-every-web-developer-must-know-part-1--net-31177)

2. [Introduction to REST](https://www.youtube.com/watch?v=YCcAE2SCQ6k)
3. [How to design a good API and why it matters](https://www.youtube.com/watch?v=aAb7hSCtvGw)
4. [Spring Boot Introduction](https://www.baeldung.com/spring-boot-start)
5. [Building Rest Services With Spring - Practical Tutorial](https://spring.io/guides/tutorials/rest/)
6. [REST API documentation with Swagger](http://swagger.io/getting-started/)

## Topic Practice

Create a Egg's Shopping API where you can list 

1. Using GET, POST, PUT and DELETE HTTP methods
2. Defining the URL for each request
3. Write the swagger file.
4. Create and document with swagger a REST API to register users. The API must provide: add, delete, update, find by name and find by nickname operations. Note that the username must be unique.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

# Optional Topic: Database Interaction and ORMs

## Reading:
1. [MySql basics](http://www.vogella.com/tutorials/MySQL/article.html)
2. [SQL Joins](https://blog.codinghorror.com/a-visual-explanation-of-sql-joins/)
3. [Jdbc basics](http://www.vogella.com/tutorials/MySQLJava/article.html#jdbc)

## Extra documentation:

1. [Optimizaciones en MySql](http://www.arsys.info/programacion/bases-de-datos/como-optimizar-bases-de-datos-mysql/)
2. [JPA](https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html) 
3. [Spring Data](https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa)


## Topic Practice:
Do not solve the practice using JDBC, please just send us the sql scripts.

1. Create a database named 'high-school' and modelate:
 
   - Student: first name, last name, registration number, date of birth)
   - Teacher: first name, last name, date of birth)
   - Course: name, assigned teacher, hours by week, schedule time (they can be dictated several times during the week)

   Notes:
   - An student can assist several courses during the same year.
   - A teacher can be assigned to several courses.
   - For each course, each student has 3 partial notes and a final note.
   - Create all relationship that you think they are required.

2. Insert information for 3 teachers, 3 courses and 10 students per course.
3. List students and teachers for a given course. The output format should be:

        Course: <course-name>
        Teacher: <last-name>, <first-name>
        Students:
          <last-name>, <first-name> (ordered by alphabetically by last name)

4. Percentage of students that passed/failed a given course.
5. For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name. The format should be:

        Teacher: <last-name>, <first-name>
        Schedule:
          Monday 09:00 - 11:00: <course-name>
          Monday 15:00 - 17:30: <course-name>
          Friday 08:45 - 10:40: <course-name>

6. Identify and Optimize all queries.
7. Connect to MySQL using Java JDBC and perform the query you have developed in excercise 5.

## Commit:

Commit your practice code, whatever you have accomplished.

→ [index](#index)

Thanks for reading!


# Deliverables Plan


|Topic| Start Date | Finish Date|
|-----|------------|------------|
|Topic 0-1 |	04/05/2021|	10/05/2021
|Topic 2-3|	10/05/2021|	17/05/2021
|Topic 4|	17/05/2021|	24/05/2021
|Topic 5|	24/05/2021|	31/05/2021


→ [index](#index)
