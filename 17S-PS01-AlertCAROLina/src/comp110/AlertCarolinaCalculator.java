package comp110;

/*
 * Author: <Gabriela Munoz>
 *
 * ONYEN: <gmmunoz>
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been 
 * received or given in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 */
public class AlertCarolinaCalculator {

	public static void main(String[] args) {

		Console console = new Console("Alert CAROLina Calculator");

		// TODO: Calculate Alert Carolina Score
		double temp;
		temp = console.promptDouble("Temperature in Farenheit:");
				
		double fallensnow;
		fallensnow = console.promptDouble("Inches of Snow Fallen:");
		
		double projectedsnow;
		projectedsnow = console.promptDouble("Inches of snow projected:");

		double temperatureincelsius = (temp - 32) * 5/9; 
		console.print("Temperature (C): " + temperatureincelsius);
		
		double totalsnow = (fallensnow + projectedsnow) * 2.54;
		console.print("Total snow (cm): " + totalsnow);
		
		double risk = -1.0 * temperatureincelsius + 5.0 * totalsnow;
		console.print("Alert Carolina Risk Score: " + risk);
		
		
		
		
		
		
		
		
		
		
		

	}

}