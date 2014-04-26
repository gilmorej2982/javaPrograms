package program03;

/*Jessica Gilmore
 *gilmorej
 *CS 201 811
 *Assignemnt 3
 *
 *This program is designed to take a pitcher's first name, last name, 
 *number of earned runs, number of innings pitched as input
 *and output the calculated ERA of the pitcher.
 */

//import the Scanner class
import java.util.Scanner;

public class program03 {
	public static void main(String[] args) {
		// Create an input scanner for keyboard
		Scanner stdln = new Scanner(System.in);

		// Declare first name, last name, runs, innings and ERA variables
		String fName;
		String lName;
		int runs;
		double innings;
		double ERA;

		// Prompt for first name, last name, runs and innings from user
		System.out.print("Enter pitcher's first name: ");
		fName = stdln.next();
		System.out.print("Enter pitcher's last name: ");
		lName = stdln.next();
		System.out.print("Enter number of earned runs: ");
		runs = stdln.nextInt();
		System.out.print("Enter number of innings pitched: ");
		innings = stdln.nextInt();

		// Figure out the ERA for the pitcher
		ERA = ((9 * runs) / innings);

		// Print out the results of the equation

		System.out.println(fName + " " + lName + " has an ERA of " + ERA);

		// Close the input scanner
		stdln.close();
	}
}
