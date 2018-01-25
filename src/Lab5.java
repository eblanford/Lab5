
/*
 *Emily Blanford 1/25/2018
 * 
 * Lab 5
 */

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum;
		String keepGoing = "y";

		// Greeting
		System.out.println("Welome to the Grand Circus Casino!");

		// User Prompt for number of sides
		System.out.print("\nHow many sides should each die have? ");

		// Tests for valid input
		while (!scan.hasNextInt()) {
			System.out.println("Invalid selction. Please enter a whole number: ");
			scan.next();
		}

		// Stores valid use input
		userNum = scan.nextInt();

		// counts number of rolls until the user chooses to stop
		for (int i = 1; keepGoing.equalsIgnoreCase("y"); i++) {

			// Stores the roll values to test conditions below
			int roll1 = diceRoll(userNum);
			int roll2 = diceRoll(userNum);

			// Outputs the rolls & roll number
			System.out.println("\nRoll " + i + ":");
			System.out.println(roll1 + "\n" + roll2);

			// Challenge conditions
			if (roll1 == 1 && roll2 == 1) {
				System.out.println("snake eyes! sssssss");
			} else if ((roll1 == 6 && roll2 == 6)) {
				System.out.println("box cars!");
			} else if (((roll1 + roll2) == 7) || ((roll1 + roll2) == 11)) {
				System.out.println("craps!");
			}

			// roll again?
			System.out.print("\nRoll again? (y/n):");
			keepGoing = scan.next();
		}

		System.out.println("\nGoodbye.");

		scan.close();
	}

	// method to generate a roll based on side of die
	public static int diceRoll(int num) {
		int roll = (int) (Math.random() * (num)) + 1;
		return roll;
	}

}
