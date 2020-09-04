/**
 * 
 * @author Aaditya Bhoota
 * period  3
 */
public class Coins {
	private int cents;
	
	// declare a private instance variable called cents
	// your code goes here


	/**
	 * constructor to initialize the instance variables
	 * @param money - amount for which the change is to
	 * 			be computed
	 */
	public Coins(int money)
	{
		cents = money;

		// your code goes here
	}
	/**
	 * method to calculate the change
	 * @param money the amount for which the change is 
	 * 			to be computed
	 */
	public void change()
	{
		int leftOver = cents;
		int quarters = leftOver / 25;
		leftOver %= 25;
		int dimes = leftOver / 10;
		leftOver %= 10;
		int nickels = leftOver / 5;
		leftOver %= 5;
		int pennys = leftOver;
		
		System.out.println( cents + " Cents => ");
		System.out.println(" Quarter(s)\t" + quarters);
		System.out.println(" Dime(s)\t" + dimes);
		System.out.println(" Nickel(s)\t" + nickels);
		System.out.println(" Penny(s)\t" + pennys);
		
	}

}