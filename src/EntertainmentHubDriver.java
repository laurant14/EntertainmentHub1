/**
 * @author Laura Trombetta, Sarayu Das, Veronica Tanukula
 * The main method of the program.
 * Uses the runSim method from the DriverHelper class to run through the program
 */

import java.io.IOException;

public class EntertainmentHubDriver {

	public static void main(String[] args) throws IOException {
		DriverHelper DH=new DriverHelper();
		System.out.println("Welcome to Entertainment Hub!");
		DH.runSim();
	}
}
