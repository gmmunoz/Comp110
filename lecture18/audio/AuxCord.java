package comp110.lecture18.audio;

// TODO: Implement the AudioOutputDevice interface
public class AuxCord implements AudioOutputDevice {

	// TODO: Declare and define the required methods of the
	// AudioOutputDevice interface
	public void emitAudio(String audio) {
		System.out.println("Straight fire on the aux: " + audio);
	}

}
