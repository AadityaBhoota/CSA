/**
 * 
 * @author Aaditya Bhoota
 * Period 3
 *
 */
public class LoanTable {
	//Declare your instance variables here
	private int years;
	private double principal, low, high;
	
	/**
	 * Constructor
	 * @param principal - principal amount borrowed
	 * @param years - number of years for the loan to be paid off
	 * @param low - low interest rate
	 * @param high - high interest rate
	 */
	public LoanTable(double principal, int years, double low, double high) {
		this.principal = principal;
		this.years = years;
		this.low = low;
		this.high = high;
	}
	/**
	 * Method to print the Loan table
	 */
	public void printTable()
	{
	   double monthlyPayment, c, k, n;
	   n = years * 12;
	   
		//Print table heading
		System.out.println("Annual Interest Rate    Monthly Payment\n");
		
		for(double i = low; i <= high; i += 0.25) {
		   k = (i/100) / 12.0;
	      c = Math.pow((1 + k), n);
		   monthlyPayment = (principal * k * c) / (c - 1);   
		   System.out.printf("%15.2f%17.2f\n", i, monthlyPayment);
		}
		
			

	}

}