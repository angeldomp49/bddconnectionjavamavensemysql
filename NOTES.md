to exec
mvn package
java -cp target/first-app-1.0-SNAPSHOT.jar com.example.one.App

__REFERENCES__

https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/26258-jdbc-decouvrez-la-porte-dacces-aux-bases-de-donnees
https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html
https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-connect-drivermanager.html



# Steps for install MySQL Driver for java #

download the JAR mysql connector for java, from https://dev.mysql.com/downloads/connector/j/ select the independent platform option
and download the compressed corresponding file, ZIP or TAR.

The JAR file should be added into the environment variables, no matter the file location.

Add the file into dependencies on the pom.xml file.

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.23</version>
      <scope>compile</scope>
    </dependency>

Call the driver from the java code.

    Class.forName("com.mysql.cj.jdbc.Driver");

Once made it, run the following commands

    mvn package
    java -cp libs\mysql-connector-java-8.0.22.jar;target\first-app-1.0-SNAPSHOT.jar com.example.one.App

Notice the first JAR file called is *libs\mysql-connector-java-8.0.22.jar* (the mysql connector), the second file is *target\first-app-1.0-SNAPSHOT.jar* both separated by 
semicolon *;*. Finally use the class name to be executed *com.example.one.App*.
