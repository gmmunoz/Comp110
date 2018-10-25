package comp110.lecture09;

public class AreYouMyLoverSolution {

  public static void main(String[] args) {
    Console console = new Console("Are you my lover?");
    console.speed(0.5);

    while (true) {

      console.alert("Are you my lover? Enter your info to find out!");

      // TODO: Construct a Profile
      LoverProfileSolution maybae = new LoverProfileSolution();

      // TODO: Print hi
      console.alert("Hi " + maybae.getName());

      // TODO: Test if Lover
      if (maybae.isLover()) {
        console.alert("We should date.");
      } else {
        console.alert("You're not my type.");
      }

    }
  }
}