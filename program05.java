package program05;

import java.util.Scanner;

public class program05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double left;
		double right;
		String input;
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.print("Please enter the left operand : ");
		left = stdIn.nextDouble();

		System.out.print("Please enter the right operand : ");
		right = stdIn.nextDouble();
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out
				.print("            + Addition\n"
						+ "            - Subtraction\n"
						+ "            * Multiplication\n"
						+ "            / Division\n");
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.print("Choose an operator from the above menu : ");
		input = stdIn.next();
		while (!(input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*"))) {

			System.out.print("Choose an operator from the above menu : ");
			input = stdIn.next();
		}
		if (input.equals("+")) {
			double answer = left + right;
			System.out.print(left + " " + input + " " + right + " = " + answer);
			input = stdIn.next();
		} else if (input.equals("-")) {
			double answer = left - right;
			System.out.print(left + " " + input + " " + right + " = " + answer);
			input = stdIn.next();
		} else if (input.equals("/")) {
			double answer = left / right;
			System.out.print(left + " " + input + " " + right + " = " + answer);
			input = stdIn.next();
		} else if (input.equals("*")) {
			double answer = left * right;
			System.out.print(left + " " + input + " " + right + " = " + answer);
			input = stdIn.next();
		}
	}

}
