/**
 * 
 * @author Aaditya Bhoota Period 3
 *
 */
public class NotChecker implements Checker {
	// Declare instance variables here
	Checker myChecker;

	/**
	 * Constructor
	 * 
	 * @param check - Checker object
	 */
	public NotChecker(Checker check) {
		myChecker = check;

	}// end constructor

	/**
	 * Method to check if the the Checker object does not contain the given string
	 * 
	 * @param str - string to check
	 * @return - true if the Checker object does not contain the give string, false
	 *         otherwise
	 */
	public boolean accept(String str) {
		if (myChecker.accept(str)){
			return false;
		}
		return true;

	}

}// end class NotChecker