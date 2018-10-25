package comp110.lecture02;

import comp110.Console;

public class ArithmeticOperators {

  public static void main(String[] args) {
    Console console = new Console("Integer Expressions");
    // Let's slow down output so it's easier to follow...
    console.speed(0.5);

    int x = console.promptInt("Enter a value for x");
    int y = console.promptInt("Enter a value for y");

    // Addition Operator
    int sum = x + y;
    console.print(x + " + " + y + " = " + sum);

    // Subtraction Operator
    int difference = x - y;
    console.print(x + " - " + y + " = " + difference);

    // Multiplication Operator
    int product = x * y;
    console.print(x + " * " + y + " = " + product);

    // *INTEGER* Division Operator
    // Note that integer division ignores any remainder and
    // by virtue of it resulting in an int: never has a decimal.
    int quotient = x / y;
    console.print(x + " / " + y + " = " + quotient);

    // *INTEGER* Modulus % Operator ("Remainder")
    // Using the % symbol between two integers will evaluate
    // to the remainder after integer division.
    // For example if 5 / 2 is 2 with a remainder of 1, then:
    // => 5 / 2 gives you 2
    // => 5 % 2 gives you 1
    int remainder = x % y;
    console.print(x + " % " + y + " = " + remainder);

    console.print(x + " divided by " + y + " is " + quotient + " with a remainder of " + remainder + ".");

  }

}