import java.util.Scanner;

public class Program07 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		welcome();
		
		int wins = 0;
		int losses = 0;

		String input;
		int numRounds = ;
		do {
			int d1 = rollDie();
			int d2 = rollDie();
			System.out.println();
			System.out.println();
			printDice(d1, d2);
			System.out.print("  " + d1 + " " + d2);
			System.out.println();
			System.out.println();
			if (isPair(d1, d2) == true) {
				System.out.println("Congrats, you win!");
				++wins;
			} else {
				System.out.println("Sorry, you lose!");
				++losses;
				System.out.println();
			}
			System.out.println();
			
			
			do {

				System.out.print("Do you wish to play again [y, n] : ");
				input = stdIn.next();
			} while (!(input.equals("y") || input.equals("n")));
			
			 if(input.equals("n")) {
				System.out.println();
				System.out.println();
				report(wins, losses);
			}++numRounds;

		} while (input.equals("y"));
	}

	// displays a brief accounting of the rules and format of the game
	public static void welcome() {
		System.out.println("     Welcome to Computer Dice");
		System.out.println("-------------------------------------");
		System.out.println("You will first roll your dice");
		System.out.println();
		System.out.println("Next the outcome of your roll will\n"
				+ "be determined:");
		System.out.println();
		System.out.println("any pair and you Win\n"
				+ "anything else and you Lose");
		System.out.println("-------------------------------------");

	}

	// returns an int in the range [1, 6]
	public static int rollDie() {

		return (int) (Math.random() * 6 + 1);

	}

	// formats d1 and d2 as a roll of two die and prints to the screen
	public static void printDice(int d1, int d2) {
		System.out.println(" Player");
		System.out.println("--------");
		int counter = 1;
		while (counter > 0 && counter <= 2) {

			++counter;
		}
	}

	// returns true only when d1 == d2
	public static boolean isPair(int d1, int d2) {

		if (d1 == d2) {

			return true;
		} else {
			return false;

		}

	}

	// displays a report of the game's outcomes to the screen
	public static void report(int wins, int losses) {
		int numRounds = 0;
		System.out.println("Computer Dice Results");
		System.out.println("---------------------");
		System.out.println("You played " + numRounds + " rounds");
		System.out.println();
		System.out.println("Rounds won   : " + wins);
		System.out.println("Rounds lost  : " + losses);
		System.out.print("---------------------");
		

	}

}
