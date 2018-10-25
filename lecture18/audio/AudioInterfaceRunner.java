package comp110.lecture18.audio;

public class AudioInterfaceRunner {

	public static void main(String[] args) {

		Phone myPhone = new Phone();

		Headphones headphones = new Headphones();

		myPhone.setDevice(headphones);
		myPhone.play("Twenty One Pilots");

		// TODO: Play out of the Speakers
		Speakers bose = new Speakers();
		myPhone.setDevice(bose);
		bose.turnOn();
		myPhone.play("Passionfruit");

		// TODO: Pass the AuxCord
		AuxCord auxcord = new AuxCord();
		myPhone.setDevice(auxcord);
		myPhone.play("Sandstorm");

	}

}