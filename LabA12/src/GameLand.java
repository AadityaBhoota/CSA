import java.util.*;

/**
 * 
 * @author Aaditya Bhoota Period 3
 */

public class GameLand {
	private Random rand;
	private int die, player1Sum, player2Sum;

	/**
	 * Method to create a new Random object and initialize with the give seed
	 * 
	 * @param seed - seed for the random number generator
	 */
	public GameLand(int seed) {
		rand = new Random(seed);

	}

	/**
	 * Method that simulates the roll of two dice
	 */
	public void roll() {
		die = rand.nextInt(6) + 1;

	}

	/**
	 * Method that runs the game. For each move print the roll and the players
	 * location after the move
	 * 
	 */
	public void moving() {
		int die1, die2, dieSum1 = 0, dieSum2 = 0;
		while (player1Sum < 100 & player2Sum < 100) {
			// Player 1
			roll();
			die1 = die;
			roll();
			die2 = die;
			dieSum1 = die1 + die2;
			if (dieSum1 == 7) {
				if (player1Sum < 7) {
					player1Sum = 0;
				} else {
					player1Sum -= 7;
				}
				System.out.println("Player A rolled a 7 >>>  ******* Player A is now at " + player1Sum);
			} else if (!(dieSum1 == 2 || dieSum1 == 12)) {
				player1Sum += dieSum1;
				if (player1Sum == player2Sum) {
					player2Sum = 0;
					System.out.println(
							"Player A rolled a " + dieSum1 + " >>> - BUMPED - Player A is now at " + player1Sum);
				} else {
					if (player1Sum < 100) {
						System.out.println("Player A rolled a " + dieSum1 + " >>> Player A is now at " + player1Sum);
					}
				}
			} else {
				if (player1Sum < 100) {
					System.out.println("Player A rolled a " + dieSum1 + " >>>  ** Player A is now at " + player1Sum);
				}
			}

			// Player 2
			roll();
			die1 = die;
			roll();
			die2 = die;
			dieSum2 = die1 + die2;
			if (player1Sum < 100) {
				if (dieSum2 == 7) {
					if (player2Sum < 7) {
						player2Sum = 0;
					} else {
						player2Sum -= 7;
					}
					System.out.println("Player B rolled a 7 >>>  ******* Player B is now at " + player2Sum);
				} else if (!(dieSum2 == 2 || dieSum2 == 12)) {
					player2Sum += dieSum2;
					if (player2Sum == player1Sum) {
						player1Sum = 0;
						System.out.println(
								"Player B rolled a " + dieSum2 + " >>> - BUMPED - Player B is now at " + player2Sum);
					} else {
						if (player2Sum < 100) {
							System.out
									.println("Player B rolled a " + dieSum2 + " >>> Player B is now at " + player2Sum);
						}
					}
				} else {
					if (player2Sum < 100) {
						System.out
								.println("Player B rolled a " + dieSum2 + " >>>  ** Player B is now at " + player2Sum);
					}
				}
			}
		}

		if (player1Sum >= 100) {
			System.out.println("Player A rolled a " + dieSum1 + " >>> Player A WINS!!");
		} else {
			System.out.println("Player B rolled a " + dieSum2 + " >>> Player B WINS!!");
		}

		System.out.printf("Player A is now at " + player1Sum + "\nPlayer B is now at " + player2Sum + "\n");
	}
}
