/**
 * 
 * @author Aaditya Bhoota Period 3
 *
 */
public class MultiplicationTable {
	/**
	 * Method to print the multiplication table for the given number of rows and
	 * columns
	 * 
	 * @param nrows - number of rows
	 * @param ncols - number of columns
	 */
	public void printTable(int nrows, int ncols) {
	   int row, col = 0;
	   System.out.print("  ");
	   for (col = 1; col <= ncols; col ++){
	      System.out.printf("%7d", col);
	   }
	   System.out.printf("\n\n");
	   for (row = 1; row <= nrows; row++) {
	      System.out.printf("%2d", row);
		   for (col = 1; col <= ncols; col++) {
			   System.out.printf("%7d", (row * col));
			}
			System.out.println();
		}

	}
}