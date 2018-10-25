package comp110.lecture01;

import comp110.Console;

public class Literals {

  public static void main(String[] args) {

    Console console = new Console("Literal Examples");

    // String literal
    console.print("Another String!");
    console.print("123");

    // int literal
    console.print(10);

    // double literal
    console.print(3.14);
   
    // char literal
    console.print('a');
    
    // boolean literal
    console.print(true);
    console.print(false);
  }

}
