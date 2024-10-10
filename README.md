# CSE2102_Lab3

## 1. Use the following to generate a pizza factory
mvn archetype:generate -DgroupId=com.example.pizza -DartifactId=pizza-factory -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

## 2. ensure that junit is in the pom.xl folder
 <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>

    Press edit Readme to see the correct structure

## 3. Place the PizzaStoreTest file with AppTest.java in the test direectory and place all other files with App.java within the main directory. Both are located within src.

## 4. Run the program with mvn clean and mvn test.
