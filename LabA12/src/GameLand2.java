import java.util.*;

/**
 * 
 * @author Nikita Salunke Period #3
 */

public class GameLand2 {
	Random r;

	private int roll, aPos, bPos;

	/**
	 * Method to create a new Random object and initialize with the give seed
	 * 
	 * @param seed - seed for the random number generator
	 */
	public GameLand2(int seed) {
		r = new Random(seed);
	}

	/**
	 * Method that simulates the roll of two dice
	 */
	public void roll() {
		roll = r.nextInt(6) + 1;
	}

	/**
	 * Method that runs the game. For each move print the roll and the players
	 * location after the move
	 * 
	 */
	public void moving() {
		int die1, die2, dieSumA = 0, dieSumB = 0;
		while (aPos < 100 && bPos < 100) {
			roll();
			die1 = roll;
			roll();
			die2 = roll;
			dieSumA = die1 + die2;
			System.out.print("Player A rolled a " + dieSumA + " >>> ");
			if (dieSumA == 7) {
				if (aPos < 7) {
					aPos = 0;
				} else {
					aPos -= 7;
				}
				System.out.println(" ******* Player A is now at " + aPos);
			} else if (!(dieSumA == 2 || dieSumA == 12)) {
				aPos += dieSumA;
				if (aPos == bPos && aPos != 0) {
					bPos = 0;
					System.out.println("- BUMPED - Player A is now at " + aPos);
				} else if (aPos < 100) {
					System.out.println("Player A is now at " + aPos);
				}
			} else {
				System.out.println(" ** Player A is now at " + aPos);
			}

			if (aPos < 100) {
				roll();
				die1 = roll;
				roll();
				die2 = roll;
				dieSumB = die1 + die2;
				System.out.print("Player B rolled a " + dieSumB + " >>> ");
				if (dieSumB == 7) {
					if (bPos < 7) {
						bPos = 0;
					} else {
						bPos -= 7;
					}
					System.out.println(" ******* Player B is now at " + bPos);
				} else if (!(dieSumB == 2 || dieSumB == 12)) {
					bPos += dieSumB;
					if (aPos == bPos && bPos != 0) {
						aPos = 0;
						System.out.println(" - BUMPED - Player B is now at " + bPos);
					} else if (bPos < 100) {
						System.out.println("Player B is now at " + bPos);
					}
				} else {
					System.out.println(" ** Player B is now at " + bPos);
				}

			}
		}
		if (aPos >= 100) {
			System.out.println("Player A WINS!!");
		} else {
			System.out.println("Player B WINS!!");
		}

		System.out.printf("Player A is now at " + aPos + "\nPlayer B is now at " + bPos + "\n");
	}
}