/**
 * @author Aaditya Bhoota Period 3
 * 
 */
public class Pyramid {
	/**
	 * Method to make a pyramid
	 * 
	 * @param n - height of the pyramid
	 */
	public static void pyramid(int n) {
		String line = "*";
		String spaces = "";

		for (int j = 1; j < n; j++) {
			spaces += " ";
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(spaces + line);
			System.out.printf("\n");
			if (i != n) {
				spaces = spaces.substring(1);
			}
			line += "**";
		}

	}

}