/***********************************************************
*Jessica Gilmore
*gilmorej
*CS 201 811
*Programming Assignment 04
*
*This program is meant to take input from the use and determine if the input is 
*a valid double literal.
*************************************************************/


import java.util.Scanner;

public class Program04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String input;

		System.out
				.print("Please enter a valid (3 character) double literal : ");
		input = stdIn.nextLine();
		char first = input.charAt(0);
		char second = input.charAt(1);
		char third = input.charAt(2);

		if (input.length() == 3) {
			if (first == '+' || first == '-') {
				if (second == '.') {
					if (third >= '0' && third <= '9') {
						System.out.print(input
										+ " is a valid (3 character)double literal");
						input = stdIn.nextLine();
					} else {
						System.out.print(input
										+ " is not a valid (3 character) double literal ");
						input = stdIn.nextLine();
						System.out.println();
					}

				} else if (second >= '0' && second <= '9') {
					if (third == '.') {
						System.out.print(input
										+ " is a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					} else {
						System.out.print(input
										+ " is not a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					}
				} else {
					System.out.print(input
									+ " is not a valid (3 character) double literal");

					input = stdIn.nextLine();
					System.out.println();
				}
			} else if (first == '.') {
				if (second >= '0' && second <= '9') {
					if (third >= '0' && third <= '9') {
						System.out.print(input
										+ " is a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					} else {
						System.out.print(input
										+ " is not a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					}
				} else {
					System.out.print(input
									+ " is not a valid (3 character) double literal");
					input = stdIn.nextLine();
					System.out.println();
				}

			} else if (first >= '0' && first <= '9') {
				if (second == '.') {
					if (third >= '0' && third <= '9') {
						System.out.print(input
										+ " is a valid (3 character)double literal");
						input = stdIn.nextLine();
						System.out.println();
					} else {
						System.out.print(input
										+ " is not a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					}

				} else if (second >= '0' && second <= '9') {
					if (third == '.') {
						System.out.print(input
										+ " is a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					} else {
						System.out.print(input
										+ " is not a valid (3 character) double literal");
						input = stdIn.nextLine();
						System.out.println();
					}
				} else {

					System.out.print(input
									+ " is not a valid (3 character) double literal");
					input = stdIn.nextLine();
					System.out.println();
				}

			} else {
				System.out.print(input
								+ " is not a valid (3 character) double literal");
				input = stdIn.nextLine();
				System.out.println();
			}
		} else {
			System.out.print(input
					+ " is not a valid (3 character) double literal");
			input = stdIn.nextLine();
			System.out.println();
		}
	}
}
