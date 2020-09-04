/**
 * 
 * @author Aaditya Bhoota Period 3
 *
 */
public class FunLoops {

	/**
	 * Method to find the first n magic squares
	 * 
	 * @param n - number of magic squares to find
	 */
	public static void magicSquares(int n) {
		int sum = 0;
		int i = 0;

		while (n > 0) {
			i++;
			sum += i;
			if (Math.pow(sum, 0.5) % 1.0 == 0) {
				n--;
				System.out.print(sum + " ");
			}
		}
	}
}

