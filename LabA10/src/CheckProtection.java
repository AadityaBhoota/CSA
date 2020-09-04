import java.util.Scanner;
/**
 * 
 * @author Aaditya Bhoota
 * Period 3
 */
public class CheckProtection {
	Scanner sc = new Scanner(System.in);
	private String amount;
	private final int MAX_LENGTH;

	/**
	 * Constructor prompts For the amount, rounds the amount to two
	 * decimal places checks if the amount entered has a length less than
	 * MAX_LENGTH If the amount exceeds the MAX_LENGTH, prints an error message
	 * If the amount is within range prints the check amount with commas and
	 * spaces filled with *
	 * @param max - max length of characters in amount
	 */
	public CheckProtection(int max) 
	{
		MAX_LENGTH = max;
		System.out.print("Enter the check amount: ");
		amount = sc.next();
		if (amount.indexOf(".") < 0) {
		   amount += ".00";
		}
		else if (amount.substring(amount.indexOf(".")).length() == 2) {
		   amount += "0";
		}
		else if (amount.substring(amount.indexOf(".")).length() > 2) {
		   amount = amount.substring(0, amount.indexOf(".") + 3);
		}
		
		if (amount.length() > MAX_LENGTH) {
		   System.out.println("Error Message");
		}
		else {
		   printAmount();
		}
	}

	/**
	 * Adds commas to the number recursively
	 * 
	 * @param s - number as a string
	 * @return - number with commas inserted
	 */
	public String addCommas(String s) 
	{
	   
	   if (s.indexOf(".") >= 0) {
	      return addCommas(s.substring(0, s.indexOf("."))) + s.substring(s.indexOf("."));
	   }
	   if (s.length() <= 3) {
	      return s;
	   }
	   else {
	      return addCommas(s.substring(0, s.length() - 3)) + "," + s.substring(s.length() - 3);
	   }
	}

	/**
	 * Adds the stars to fill in leading spaces recursively
	 * 
	 * @param s - number as a string
	 * @return - number with leading stars
	 */
	public String addAsterisks(String s) 
	{
	   if (s.length() < MAX_LENGTH) {
	      return addAsterisks("*" + s);
	   }
		return s;
	}

	/**
	 * Prints the amount with leading stars and commas in the between
	 */
	public void printAmount() 
	{
		System.out.println("amount = $" + addAsterisks(addCommas(amount)));
	}
}