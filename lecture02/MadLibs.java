package comp110.lecture02;

import comp110.Console;

public class MadLibs {

  public static void main(String[] args) {

    Console console = new Console("MadLibs Demo");

    String positiveAdj = console.promptString("Give me a positive adjective");
    String negativeAdj = console.promptString("Give me a negative adjective");
    String verb = console.promptString("Give me a violent verb");

    int uncScore = console.promptInt("Give me a large number");
    int dookScore = console.promptInt("Give me a small number");

    int winBy = uncScore - dookScore;

    String madlibs = "On February 9th, the " + positiveAdj + " UNC basketball team";
    madlibs = madlibs + " is going to " + verb + " the " + negativeAdj + " Dook team";
    madlibs = madlibs + " and win by " + winBy + " points!";

    console.print(madlibs);

  }

}
