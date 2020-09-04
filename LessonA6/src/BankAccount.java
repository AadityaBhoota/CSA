/**
 * 
 * @author aaditya
 *
 */
public class BankAccount {
	/**
	 * Instance variables
	 */
	private int myAccountNumber;
	private double myBalance;

	/**
	 * Default constructor initializes all fields to 0
	 */
	public BankAccount() {
		myAccountNumber = 0;
		myBalance = 0;
	} // end constructor

	/**
	 * Parameter constructor
	 * 
	 * @param accountNumber account number
	 * @param balance       money in the account
	 */
	public BankAccount(int accountNumber, double balance) {
		myAccountNumber = accountNumber;
		myBalance = balance;
	} // end constructor

	/**
	 * returns the balance
	 * 
	 * @return returns the balance
	 */
	public double getBalance() {
		return myBalance;
	}// end method getBalance

	/**
	 * returns the account number
	 * 
	 * @return the account number
	 */
	public int getAccountNumber() {
		return myAccountNumber;
	}// end method getAccountNumber

	/**
	 * deposits a specific amont of money
	 * 
	 * @param money money to be deposited
	 */
	public void deposit(double money) {
		myBalance += money;
		System.out.printf("%s $%.2f", "Deposited ", money);
		System.out.println();
	}// end method deposit

	/**
	 * withdraws a specific amount of money
	 * 
	 * @param money money to withdraw
	 */
	public void withdraw(double money) {
		myBalance -= money;
		System.out.printf("%s $%.2f", "Withdrew ", money);
		System.out.println();
	}// end method withdraw
}// end class
