import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 
 * @author aaditya bhoota period 3
 */
public class StopWordRemover {
	private String stopList;
	private String inFile, outFile;
	private int maxLineLength;

	/**
	 * Initializes the input and output files and the max characters per line
	 * 
	 * @param in  - name of input file
	 * @param out - name of output file
	 * @param max - max characters per line (including spaces)
	 */
	public StopWordRemover(String in, String out, int max) {
		inFile = in;
		outFile = out;
		maxLineLength = max;
		stopList = "";
	}

	/**
	 * Removes the stop words and outputs the text to a file Each line of output is
	 * not more than max characters long
	 * 
	 * @return the number of words removed
	 */
	public int removeStopWords() {
		int wordsRemoved = 0;
		try {
			Scanner stopWordsScan = new Scanner(new File("stopWords.txt"));
			while (stopWordsScan.hasNext()) {
				stopList += stopWordsScan.next().toLowerCase() + " ";
			}
			stopList = " " + stopList;
			stopWordsScan.close();

			Scanner inFileScan = new Scanner(new File(inFile));
			int characterCount = 0;
			while (inFileScan.hasNext()) {

				String word = inFileScan.next();

				if (stopList.indexOf(" " + word.toLowerCase() + " ") > -1) {
					wordsRemoved++;
				} else {

					FileWriter file;

					file = new FileWriter(outFile, true);
					if (characterCount + word.length() + 2 <= maxLineLength) {
						if (characterCount == 0) {
							file.write(word);
						} else {
							file.write(" " + word);
						}
						characterCount += word.length() + 1;
					} else {
						file.write("\n" + word);
						characterCount = word.length();
					}
					file.close();

				}
			}
			inFileScan.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		return wordsRemoved;
	}

}