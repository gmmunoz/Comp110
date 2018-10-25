package comp110.lecture18.audio;

public class Phone {

    // Fields
    // Notice the field type is the AudioOutputDevice *Interface*
    private AudioOutputDevice _device;

    // Constructor
    public Phone() {
        System.out.println("A new Phone instance was constructed");
    }

    public void play(String audio) {
        System.out.println("Play " + audio + " - command received.");

        if (_device != null) {
            _device.emitAudio(audio);
        }
    }

    // Notice the parameter is the AudioOutputDevice *Interface*
    public void setDevice(AudioOutputDevice device) {
        _device = device;
    }

}