import java.util.Scanner;
/**
 * 
 * @author Aaditya Bhoota
 * period 3
 */

public class Elevator {
	private final int MAX_FLOORS = 20;
	Scanner stdin;
	private int floor;
	/**
	 * Default constructor 
	 */
	public Elevator() {
		stdin = new Scanner(System.in);
	}
	
	/**
	 * simulate method - Finds out which floor to go to and handles incorrect inputs
	 */
	public void simulate() {
		System.out.printf("Floor: ");
		if (stdin.hasNextInt()) {
			floor = stdin.nextInt();
			if (floor <= 0 || floor > MAX_FLOORS) {
				System.out.println("Error: The floor must be between 1 and 20");
			}
			else if (floor == 13) {
				System.out.println("Error: There is no thirteenth floor");
			}
			else if (floor >= 1 && floor <= 12) {
				System.out.println("Thank you, I will take you to the actual floor " + floor);
			}
			else if (floor >= 14 && floor <= MAX_FLOORS) {
				System.out.println("Thank you, I will take you to the actual floor " + (floor - 1));
			}
		}
		else {
			System.out.println("Error: Not an integer");
		}
	}
	
}