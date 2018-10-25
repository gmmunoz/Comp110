// These lines that begin with two forward slashes are "comments"
// Comments are for humans only. Java ignores them!
// The two slashes make a *single-line* comment

/* 
 * Another kind of comment begins with: /*
 * and continues until it reaches the same symbols in the opposite order.
 * This is a *multi-line* comment. You can see how it ends below:
 */

// The "package" each class is in corresponds to the folder it is in.
package comp110.lecture01;

// This says we're making use of the comp110 Console class.
import comp110.Console;

// This is a class declaration, we'll learn all about classes in a few weeks.
public class HelloWorld {

  // This is the *main* method declaration. The main method is the starting
  // point for *all* Java programs.
  public static void main(String[] args) {

    // Here we're setting up a Console to use named, simply, 'console'.
    Console console = new Console();

    // TODO: Print "Hello, World"
    
    
    // this means that this is a comment and a comment is a note
    console.print("Hello, World");
    console.print("Bye");
  }

}
