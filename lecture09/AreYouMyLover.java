package comp110.lecture09;

public class AreYouMyLover {

	public static void main(String[] args) {
		Console console = new Console("Are you my lover?");
		console.speed(0.5);

		while (true) {

			console.alert("r u my lover? Make a profile to find out!");

			// TODO: Construct a Profile
			LoverProfile maybae;
			maybae = new LoverProfile();
			// LINE ABOVE CAUSES JAVA TO MOVE TO OTHER PROFILE

			// TODO: Print "Hi " + <object>.getName()
			console.print("Hi " + maybae.getName());

			// TODO: Test if Lover
			if (maybae.isLover()) {
				console.print("We should def hang out tn!");
			} else {
				console.print("Please give me back my laptop.");
			}
		}
	}
}