/**
 * Taxes class - class used to calculate the federal, social security and state
 * taxes
 * 
 * @author Aaditya Bhoota Period 3
 */
public class Taxes {
	// declare instance variables
	private double hoursWorked;
	private double hourlyRate;

	// Your code goes here

	// declare constants
	private final double FEDTAX = 0.15;
	private final double FICA = 0.0765;
	private final double STATETAX = 0.04;

	// Your code goes here

	/**
	 * 
	 * @param hours hours worked
	 * @param rate  rate per hour
	 */
	public Taxes(double hours, double rate) {
		hoursWorked = hours;
		hourlyRate = rate;

	}// end constructor

	/**
	 * 
	 * @return returns number of hours worked
	 */
	public double getHoursWorked() {
		return hoursWorked;

	}// end method

	/**
	 * 
	 * @return returns rate per hour
	 */
	public double getHourlyRate() {
		return hourlyRate;

	}// end method

	/**
	 * 
	 * @return returns federal tax
	 */
	public double getFedTaxRate() {
		return FEDTAX;
	}// end method

	/**
	 * 
	 * @return returns FICA
	 */
	public double getSocSecurityRate() {
		return FICA;
		// Your code goes here

	}// end method

	/**
	 * 
	 * @return returns state tax
	 */
	public double getStateTaxRate() {
		return STATETAX;

	}// end method

	/**
	 * 
	 * @return calculates money made before tax
	 */
	public double computeGrossPay() {
		return hourlyRate * hoursWorked;

	}// end method

	/**
	 * 
	 * @return calculates federal tax
	 */
	public double computeFedTax() {
		double grossPay = computeGrossPay();
		return grossPay * FEDTAX;
	}// end method

	/**
	 * 
	 * @return calculates the FICA tax
	 */
	public double computeSocSecurity() {
		double grossPay = computeGrossPay();
		return grossPay * FICA;
		// Your code goes here

	}// end method

	/**
	 * 
	 * @return calculates state tax
	 */
	public double computeStateTax() {
		double grossPay = computeGrossPay();
		return grossPay * STATETAX;

	}// end method

	/**
	 * 
	 * @return returns total tax
	 */
	private double computeTotalTax() {
		return computeFedTax() + computeSocSecurity() + computeStateTax();

	}// end method

	/**
	 * 
	 * @return returns next pay
	 */
	public double computeNetPay() {
		double grossPay = computeGrossPay();
		return grossPay - computeTotalTax();
	}// end method

}