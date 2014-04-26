import java.util.Scanner;

public class Program06 {
	public static void main(String[] args) {

		System.out.println("#####################################");
		System.out.println("#   Welcome to the guessing game!   #");
		System.out.println("#####################################");
		System.out.println();
		System.out.println("Think of a number between 1 and 1000");
		System.out.println("and I'll guess it within 10 tries.");
		System.out.println("Press enter when ready...");

		Scanner stdIn = new Scanner(System.in);
		String response = stdIn.nextLine();
		int guess;
		int min = 1;
		int max = 1000;
		int numGuesses = 1;

		System.out.println("Guessing between 1 and 1000");
		guess = (min + max) / 2;
		System.out.println("My guess is " + guess);
		do {

			System.out.print("Is that it? (y/n): ");
			response = stdIn.nextLine();
			guess = (min + max) / 2;
			
			if (response.equalsIgnoreCase("y")
					|| response.equalsIgnoreCase("n")) {
				while (!response.equalsIgnoreCase("y") && numGuesses < 10) {

					System.out.print("Is it higher or lower than " + guess
							+ "? (h/l): ");
					response = stdIn.nextLine();
					

					if(response.equalsIgnoreCase("h")){
						min = guess + 1;
						System.out.println();
						System.out.println("Guessing between " + (guess + 1)
								+ " and " + max);
						guess = (min + max) / 2;
						System.out.println("My guess is " + guess);
						System.out.print("Is that it? (y/n): ");
						response = stdIn.nextLine();
						guess = (min + max) / 2;
						++numGuesses;
					} else if (response.equalsIgnoreCase("l")) {
						max = guess - 1;
						System.out.println();
						System.out.println("Guessing between " + min + " and "
								+ (guess - 1));
						guess = (min + max) / 2;
						System.out.println("My guess is " + guess);
						System.out.print("Is that it? (y/n): ");
						response = stdIn.nextLine();
						guess = (min + max) / 2;
						++numGuesses;
					} else{
						System.out.print("Is it higher or lower than " + guess + "? (h/l): ");
						response = stdIn.nextLine();
					}

				} if (response.equalsIgnoreCase("y")) {
					System.out.println();
					System.out.print("I got it in " + numGuesses + " guesses!");
				} else if (numGuesses >= 10) {
					System.out.println();
					System.out.print("I don't work if you lie to me.");
				} 
			} else {
				System.out.print("Is that it? (y/n): ");
				response = stdIn.nextLine();
			}
		} while (!response.equalsIgnoreCase("y") && numGuesses < 10);
	}
}

/*
 * if (response.equals("")) { System.out.println("Guessing between 1 and 1000");
 * guess = (min + max) / 2; System.out.println("My guess is " + guess);
 * System.out.println("Is that it? "); response = stdIn.nextLine(); if
 * (!response.equalsIgnoreCase("y") || !response.equalsIgnoreCase("n")) {
 * 
 * if (response.equalsIgnoreCase("y")) { System.out .println("I got it in " +
 * numGuesses + "guesses!"); } else {
 * System.out.println("Is it higher or lower than " + guess + "? (h/l): ");
 * 
 * } response = stdIn.nextLine();
 * 
 * guess = (min + max) / 2; ++numGuesses; while (response.equalsIgnoreCase("l")
 * && numGuesses < 10) { System.out.println("Guessing between 1 and " + (guess -
 * 1)); max = guess; guess = (min + max) / 2; System.out.println("My guess is "
 * + guess); ++numGuesses; System.out.println("Is that it? "); response =
 * stdIn.nextLine();
 * 
 * if (response.equalsIgnoreCase("y")) { System.out.println("I got it in " +
 * numGuesses + "guesses!"); } else {
 * System.out.println("Is it higher or lower than " + guess + "? (h/l): ");
 * response = stdIn.nextLine(); }
 * 
 * } while (response.equalsIgnoreCase("h") && numGuesses < 10) {
 * System.out.println("Guessing between " + (guess + 1) + " and " + max); min =
 * guess; guess = (min + max) / 2;
 * 
 * System.out.println("My guess is " + guess); ++numGuesses;
 * System.out.println("Is that it? "); response = stdIn.nextLine();
 * 
 * if (response.equalsIgnoreCase("y")) { System.out.println("I got it in " +
 * numGuesses + "guesses!"); } else {
 * System.out.println("Is it higher or lower than " + guess + "? (h/l): ");
 * response = stdIn.nextLine(); } }
 * 
 * } else { } } } }
 */
