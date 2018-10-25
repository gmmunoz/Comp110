package comp110.lecture02;

import comp110.Console;
import comp110.memes.MemePhoto;

public class CustomMemeText {

  public static void main(String[] args) {

    Console console = new Console("Custom Meme Text Demo");

    MemePhoto meme = new MemePhoto();
    meme.setImageUrl("http://i.imgur.com/sjCYBBO.jpg");

    // TODO: Prompt for a String and assign to topText variable.
    String topText = console.promptString("Top Text");
    meme.setTopText(topText);
    
    // TODO: Prompt for a String and assign to bottomText variable.
    String bottomText = console.promptString("bottomText");
    meme.setBottomText(bottomText);

  }

}