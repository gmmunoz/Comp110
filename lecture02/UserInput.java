package comp110.lecture02;

import comp110.Console;

public class UserInput {

  public static void main(String[] args) {
    Console console = new Console("User Input");

    int age; // Variable Declaration
    age = console.promptInt ("How old are you?"); // Variable Initialization

    console.print("You are");
    console.print(age); // Variable Reference
    
    int yearsUntil100 = 100 - age; // Variable Declaration & Initialization
    console.print("You will be 100 in");
    console.print(yearsUntil100); // Variable Reference
    console.print("years");
  }

}