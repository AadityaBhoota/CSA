
/**
 * 
 * @author Aaditya Bhoota Period 3
 *
 */
public class Chocolate {
	/**
	 * Checks if we can make chocolate bars
	 * 
	 * @param big   - number of big bricks
	 * @param small - number of small bricks
	 * @param goal  - length of chocolate bar
	 * @return - true if we have enough bricks to make a chocolate bar, false
	 *         otherwise
	 */
	public boolean canMakeBricks(int small, int big, int goal) {
		return small + big * 5 >= goal;
	}

	/**
	 * Determines number of small bricks needed to make the chocolate bar
	 * 
	 * @param big   - number of big bricks
	 * @param small - number of small bricks
	 * @param goal  - length of chocolate bar
	 * @return number of small bricks needed
	 */

	public int numberOfSmallBricksNeeded(int small, int big, int goal) {
		if (goal % (big * 5) > small) {
			return -1;
		}
		return goal % (big * 5);
	}

}