package comp110.lecture26;

public class StringToPrimitives {

	public static void main(String[] args) {

		String anIntegerString = "110";
		String aDoubleString = "110.01";
		String aBooleanString = "true";

		int anInteger = 0;
		double aDouble = 0.0;
		boolean aBoolean = false;

		// TODO: Parse the Strings and assign the result to the corresponding
		// primitive-typed local variable.
		anInteger = Integer.parseInt(anIntegerString);
		aDouble = Double.parseDouble(aDoubleString);
		aBoolean = Boolean.parseBoolean(aBooleanString);

		System.out.println("anInteger: " + anInteger);
		System.out.println("aDouble: " + aDouble);
		System.out.println("aBoolean: " + aBoolean);

	}

}
