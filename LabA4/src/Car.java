/**
 * 
 * @author Aaditya Bhoota
 * period 3
 */

public class Car {
	//your code goes here
	private int startOdometer;
	private int currentOdometer;
	private double gallonsConsumed;
	
	//default constructor
	public Car(int start) {
		startOdometer = start;
		currentOdometer = 0;
		gallonsConsumed = 0;
	}
	/**
	 * Resets the variables and sets starting odometer to the current odometer
	 */
	public void resetMPG() {
		startOdometer = currentOdometer;
		gallonsConsumed = 0;
	}
	
	/**
	 * Calculates the miles per gallon
	 * 
	 * @return miles per gallon
	 */
	public double calculateMPG() {
		double mpg = (currentOdometer - startOdometer) / gallonsConsumed;
		return mpg;
	}
	/**
	 * sets field variables to user input values
	 */
	public void fillUp(int currentMeter, double gallonsUsed) {
		currentOdometer = currentMeter;
		gallonsConsumed = gallonsUsed;
	}
	
}//end class