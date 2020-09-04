import java.io.*;

import java.util.*;

/**
 * 
 * @author aaditya Bhoota Period 3
 *
 */
public class Average {

	private String fileName;

	/**
	 * 
	 * @param f - file name
	 */
	public Average(String f) {
		fileName = f;
	}

	/**
	 * 
	 * @return return the avg
	 */
	public double scanDataAndCalculateAverage() {

		long sum = 0;
		int count = 0;
		try {
			Scanner in = new Scanner(new File(fileName));
			if (!in.hasNext()) {
				throw new NoSuchElementException(fileName + " is empty");
			}
			if (!in.hasNextInt()) {
				throw new NoSuchElementException(fileName + " does not have numeric data");
			}
			while (in.hasNextInt()) {
				sum += in.nextInt();
				count ++;
			}
			return sum / (count * 1.0);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			return 0;
		}
		

	}
}