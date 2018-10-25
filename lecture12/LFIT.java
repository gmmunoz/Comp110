package comp110.lecture12;

public class LFIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human girl = new Human();
		girl.setName("Sammi");

		Human cody = new Human();
		cody.setName("Cody");

		// Demo 1
		// cody.lower();
		// cody.push();

		// Demo 2
		// girl.pushup();
		// cody.pushup();
		// cody.pushup();

		// Demo 3
		girl.doPushups(5);
		cody.doPushups(3);

		System.out.println(girl.toString());
		System.out.println(cody.toString());

	}

}
