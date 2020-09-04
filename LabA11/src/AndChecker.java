/**
 * 
 * @author Aadita Bhoota Period 3
 *
 */
public class AndChecker implements Checker {
	// Declare instance variables here
	Checker myFirstChecker;
	Checker mySecondChecker;

	/**
	 * Constructor
	 * 
	 * @param firstChecker  - first Checker object
	 * @param secondChecker - second Checker object
	 */
	public AndChecker(Checker firstChecker, Checker secondChecker) {
		myFirstChecker = firstChecker;
		mySecondChecker = secondChecker;
	}// end constructor

	/**
	 * Method to check if the given string is accepted by both of the Checker
	 * objects
	 * 
	 * @param str - string to be checked
	 * @return - true if the string is contained in both Checker objects and false
	 *         otherwise
	 */
	public boolean accept(String str){
		if (myFirstChecker.accept(str) && mySecondChecker.accept(str)) {
			return true;
		}
		return false;

	}// end accept

}// end class AndChecker