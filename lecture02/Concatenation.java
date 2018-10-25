package comp110.lecture02;

import comp110.Console;

public class Concatenation {

  public static void main(String[] args) {
    Console console = new Console("String Concatenation Examples");
    
    // Example
    String name;
    name = console.promptString("What is your name?");
    // Here we are concatenating the phrase "Hello, " with
    // the name you enter, such that it prints out:
    // "Hello, <name>";
    String welcomeMessage = "Hello, " + name;
    console.print(welcomeMessage);
    
    int age; // Declaration
    age = console.promptInt("How old are you? "); // Initialization

    // TODO: Use concatenation to assign a String to firstMessage 
    // such that your program prints out:
    // "You are <age>"
    String firstMessage = "You are " + age + " years old. ";
    console.print(firstMessage);
    
    // TODO: Use concatenation to assign a String to firstMessage 
    // such that your program prints out:
    // "You will be 100 in <yearsUntil100> years." 
    int yearsUntil100 = 100 - age;
    String secondMessage = "You will be 100 in " + yearsUntil100 + " years.";
    console.print(secondMessage);
 
  }

}