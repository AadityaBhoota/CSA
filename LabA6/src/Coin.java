import java.util.Random;

/**
 * 
 * @author Aaditya Bhoota Period 3
 */
public class Coin {
	// instance variables
	private Random rand;

	/**
	 * 
	 * @param seed given seed to give specific random numbers
	 */
	public Coin(int seed) {
		rand = new Random(seed);

	}

	/**
	 * flips a coin one time
	 */
	public void flip() {
		System.out.println("Flipped " + (rand.nextInt(2) + 1));
	}

	/**
	 * flips a coin 5 times
	 */
	public void flip5() {
		flip();
		flip();
		flip();
		flip();
		flip();
	}
}