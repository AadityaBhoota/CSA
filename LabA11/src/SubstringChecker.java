/**
 * 
 * @author Aaditya Bhoota Period 3
 *
 */
public class SubstringChecker implements Checker {
	// Declare instance variables here
	String myStr;

	/**
	 * Constructor
	 * 
	 * @param str - String to check
	 */
	public SubstringChecker(String str) {
		myStr = str;

	}// end constructor

	/**
	 * Method to check if the given string is acceptable
	 * 
	 * @param str - String to check
	 * @return - true if the given string contains myStr, false otherwise
	 */
	public boolean accept(String str) {
		if (str.indexOf(myStr) > -1) {
			return true;
		}
		return false;

	}// end accept

}