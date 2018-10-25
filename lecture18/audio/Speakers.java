package comp110.lecture18.audio;

// Notice the class is declaring it is an implementation of an AudioOutputDevice
public class Speakers implements AudioOutputDevice {

    // Fields
    private boolean _powered;
    private double _volume;

    // Constructor
    public Speakers() {
        _powered = false;
        _volume = 11.0;
    }

    // This emitAudio method is required by the AudioOutputDevice interface
    public void emitAudio(String audio) {
        if (_powered) {
            System.out.println(audio + " is blasting from speakers at volume " + _volume + "!");
        } else {
            System.out.println("The speakers are turned off.");
        }
    }

    // NOTICE: Classes which implement interfaces can have other methods, too!
    public void turnOn() {
        _powered = true;
    }

    public void turnOff() {
        _powered = false;
    }

}
