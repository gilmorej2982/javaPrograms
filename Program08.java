import java.util.Scanner;

public class Program08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int cash = 100;
		int choice;

		// display welcome
		displayWelcome();
		System.out.println();

		System.out.println("You have $" + cash);
		System.out.println();
		choice = getMenuChoice(stdIn);
		while (cash > 0 && (choice == 1 || choice == 2 || choice == 3)) {
			if (choice == 1) {

				int bet = getBet(stdIn, cash);

				boolean win = playNumberBet(stdIn);
				if (win == true && cash > 0) {

					cash = cash + (bet * 35);
//					System.out.println("You have $" + cash);
//					System.out.println();
//					choice = getMenuChoice(stdIn);
				} else if (win == false && cash > 0) {

					cash = cash - bet;
//					System.out.println("You have $" + cash);
//					System.out.println();
//					choice = getMenuChoice(stdIn);
				} else {
					System.out.println();
					System.out.println("You finished with $" + cash);
				}

			} else if (choice == 2) {

				int bet = getBet(stdIn, cash);

				boolean win = playColorBet(stdIn);
				if (win == true && cash > 0) {

					cash = cash + bet;
//					System.out.println("You have $" + cash);
//					System.out.println();
//					choice = getMenuChoice(stdIn);
				} else if (win == false && cash > 0) {

					cash = cash - bet;
//					System.out.println("You have $" + cash);
//					System.out.println();
//					choice = getMenuChoice(stdIn);
				} else {
					System.out.println();
					System.out.println("You finished with $" + cash);
				}

			} else {
				System.out.println();
				System.out.print("You finished with $" + cash);
				return;
			}
			
		}
		System.out.println();
		System.out.print("You finished with $" + cash);

	}

	public static void displayWelcome() {
		System.out.println("############################");
		System.out.println("# WELCOME TO ROULETTE      #");
		System.out.println("############################");
		System.out.println("# NUMBER BETS PAYOUT: 35:1 #");
		System.out.println("# COLOR BETS PAYOUT: 1:1   #");
		System.out.println("############################");
	}

	public static int getMenuChoice(Scanner stdIn) {
		System.out.println("--- CHOOSE A BET ---");
		System.out.println("1. Pick a number.");
		System.out.println("2. Pick a color.");
		System.out.println("3. Cash out.");
		System.out.print("Enter a choice (1-3): ");
		int betChoice = stdIn.nextInt();
		while (!(betChoice >= 1 && betChoice <= 3)) {
			System.out.print("Enter a choice (1-3): ");
			betChoice = stdIn.nextInt();
		}

		return betChoice;
	}

	public static int getBet(Scanner stdIn, int cash) {// Scanner stdIn
		int bet;
		do {
			System.out.print("Enter your bet (1-" + cash + "): ");
			bet = stdIn.nextInt();
		} while (!(bet >= 1 && bet <= cash));
		return bet;
	}

	// returns an int in the range [0, 36]
	public static int spin() {
		return (int) (Math.random() * 36 + 0);
	}

	public static boolean playNumberBet(Scanner stdIn) {
		// int numberChoice;
		// do {
		System.out.print("Enter a number (0-36): ");
		int numberChoice = stdIn.nextInt();
		while (!(numberChoice >= 0 && numberChoice <= 36)) {
			System.out.print("Enter a number (0-36): ");
			numberChoice = stdIn.nextInt();
		}
		int spin = spin();

		String randColor = determineColor(spin);

		if (numberChoice == spin) {
			System.out.println("Spin value: " + spin);
			System.out.println("Spin color: " + randColor);
			System.out.println("You won!");

			return true;
		} else {
			System.out.println("Spin value: " + spin);
			System.out.println("Spin color: " + randColor);
			System.out.println("You lost.");

			return false;
		}

	}

	public static boolean playColorBet(Scanner stdIn) {// Scanner stdIn
		// String color;
		// do {
		System.out.print("Enter a color (red or black): ");
		String color = stdIn.next();

		while (!(color.equals("red") || color.equals("black"))) {
			System.out.print("Enter a color (red or black): ");
			color = stdIn.next();
		}
		int spin = spin();

		String randColor = (determineColor(spin));

		if (color.equals(randColor)) {
			System.out.println("Spin value: " + spin);
			System.out.println("Spin color: " + randColor);
			System.out.println("You won!");

			return true;
		} else {
			System.out.println("Spin value: " + spin);
			System.out.println("Spin color: " + randColor);
			System.out.println("You lost.");

			return false;
		}
	}

	public static String determineColor(int number) {
		if (number == 0) {
			return "green";
		} else if (number % 2 == 0) {
			return "red";
		} else {
			return "black";
		}
	}

}