package comp110.lecture18.audio;

public class Headphones implements AudioOutputDevice {

  public void emitAudio(String audio) {
    System.out.println(audio + " is playing in headphones!");
  }

}
