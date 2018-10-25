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
public class CarolQuest {

	public static void main(String[] args) {

		Chancellor carol = new Chancellor("gmmunoz");
		//commands 
		carol.turnLeft(3);
		carol.moveForward(40);
		carol.turnLeft(75);
		carol.moveForward(25);
		carol.turnLeft(45);
		carol.moveForward(15);
		carol.mountRameses();
		carol.turnLeft(45);
		carol.moveForward(15);
		carol.turnRight(60);
		carol.moveForward (10);
		carol.turnLeft(75);
		carol.moveForward(30);
		carol.turnLeft(90);
		carol.moveForward(70);
		carol.turnLeft(90);
		carol.moveForward(10);
		carol.talkToRoy();
		carol.turnLeft(180);
		carol.moveForward(10);
		carol.turnLeft(90);
		carol.moveForward(40);
		carol.turnLeft(90);
		carol.moveForward(23);
		carol.turnLeft(90);
		carol.moveForward(10);
		carol.getAlertCarolinaCode();
		
		
	}

}