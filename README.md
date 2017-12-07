#selenium-basics

This is a basic sample of how to use Selenium WebDriver with Page Object pattern, for those who are starting with
automated tests for websites

Bellow, a list of what you should have configured to run this project


#Maven

https://maven.apache.org/download.cgi
If you're familiar with the Java world, this shouldn't be a surprise for you. For who don't know it, in short words,
Maven is a powerful tool, with this we can manage our build, download the project dependencies.


#How do I run it?

Open de project directory and run this command line to install the standalone deendency in your .m2

`mvn install:install-file -Dfile=${basedir}\src\main\resources\selenium-server-standalone-3.8.1.jar -DgroupId=org.seleniumhq.selenium -DartifactId=selenium-standalone-server -Dversion=3.8.1 -Dpackaging=jar`


And install the dependencies in your project

`mvn clean install -U`