# Data driven testing framework using Selenium 4


# Introduction
This template will help you to implement a data driven testing framework. The most famous tool for testing web applications is selenium webdriver and we have used selenium webdriver in this template. We have also used apache poi because we used excel file as our test data. So the template will basically help you to have an integrated data driven testing framework using selenium 4.

# What is data driven testing framework
A data driven testing framework is a technique in which you keep input test data separate from the actual test script.This DDT framework is totally dependent on the input test data. There are majorly two components in the data-driven testing framework. First is the test script and second test data.
The test data set is created in external sources such as an excel file, csv file, xml file, or any database (In this template we are using excel file) . After that we connect the test script with test data to retrieve multiple sets of data to perform the application under test.


# Technologies Used
Programming language - Java

Build tool - Maven

Automation tool - Selenium Webdriver

IDE - Intellij Idea

# Dependencies Used
Selenium web driver
```
<dependency>
 <groupId>org.seleniumhq.selenium</groupId>
 <artifactId>selenium-chrome-driver</artifactId>
 <version>4.0.0</version>
</dependency>
```

Selenium java
```
<dependency>
 <groupId>org.seleniumhq.selenium</groupId>
 <artifactId>selenium-java</artifactId>
 <version>4.0.0</version>
</dependency>
```

Apache poi
```
<dependency>
 <groupId>org.apache.poi</groupId>
 <artifactId>poi</artifactId>
 <version>4.1.2</version>
</dependency>
```


Apache poi-ooml
```
<dependency>
 <groupId>org.apache.poi</groupId>
 <artifactId>poi-ooxml</artifactId>
 <version>4.1.2</version>
</dependency>
```


Typesafe Config
...
<dependency>
    <groupId>com.typesafe</groupId>
    <artifactId>config</artifactId>
    <version>1.4.1</version>
</dependency>
...



TestNG (optional)
```
<dependency>
 <groupId>org.testng</groupId>
 <artifactId>testng</artifactId>
 <version>7.4.0</version>
 <scope>test</scope>
</dependency>
```

# Steps for execution
Clone the repository on your local system.


Intellij will resolve all the required dependencies.


Check your chrome browser version and download the chromedriver accordingly from https://chromedriver.chromium.org/downloads


Go to the terminal and execute following commands:

export DRIVER_PATH=/home/knoldus/Downloads/chromedriver_linux64/chromedriver

mvn test -Dtest=WordPressLogin

(Note: in export DRIVER_PATH you will provide the path of chromedriver file in your system)

 
Now the tests will now execute on your machine.


We have used a dummy web application and excel test data in this template but you can change it accordingly.

For a better understanding please refer to this blog:-
https://blog.knoldus.com/data-driven-testing-framework-using-selenium-4/
