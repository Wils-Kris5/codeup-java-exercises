public class JARLecture {
  /*
  In this lesson we will discuss JAR files, dependencies, and maven, a way to handle both of these.
        A JAR is like a zip file but for Java files
A JAR file is a JavaARchive file. JAR files are a zipped directory that contains all the files (usually compiled .class files)
 an application needs to run, or all the classes in a library.
  Because JAR files compress a project to a single file, they are a good strategy for distributing applications and libraries.

Dependencies
A dependency is something your application depends on in order to run. Including a JAR file in our project is an example of including a dependency in our project. It is very common to have multiple dependencies (i.e. external libraries) in a project, such as:

A library that allows us to talk to a database
Libraries for listening for and responding to HTTP requests
Libraries to allow us to talk to external APIs (e.g. login with Facebook)
Libraries for interacting with JSON in Java

POM - Project Object Model

One of the challenges in software development is dependency management. This consists of providing answers to questions like these:

What libraries does your application depend on? What versions of these libraries are you using?
How do other developers on the project obtain the required libraries?
What happens when you want to upgrade a dependency to a new version?
Where are these libraries (i.e. JAR files) stored?
How are these libraries deployed or packaged with your application?
We will use Apache Maven to help us solve these problems


>> look into Gradle
Maven
"Maven" is yiddish for "accumulator of knowledge", and is also an open source project that helps manage Java projects. Maven manages dependencies through what it calls the Project Object Model. This is represented by a file at the top level of your project named pom.xml. Consequently, if you come across a project with a pom.xml file at the top level, you can be reasonably sure it as a Maven project.

The pom.xml file is an XML file. XML stands for EXtensible Markup Language and can be thought of as a stricter version of HTML. Here is an example of a pom.xml:
 <project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.codeup.hello-world</groupId>
    <artifactId>hello-world-app</artifactId>
    <version>1.0.0</version>
    <dependencies>
        <!-- https://mvnrepository.com/artifact/com.google.guava/guava -->
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>25.1-jre</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient -->
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.6</version>
        </dependency>
    </dependencies>
</project>



Sometimes the IDE overrides the Java version, so it might be necessary to specify the Java version to the maven compiler plugin by adding the following code to your pom.xml.


   */
}
