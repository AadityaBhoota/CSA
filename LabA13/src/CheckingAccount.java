/**
 * 
 * @author aaditya Bhoota Period 3
 */
public class CheckingAccount {
	private double myBalance;
	private int myAccountNumber;

	/**
	 * 
	 * @param initialBalance - initial balance
	 * @param acctNum        - account number
	 * @throws IllegalArgumentException - exception if balance is neg
	 */
	public CheckingAccount(double initialBalance, int acctNum) throws IllegalArgumentException {
		myBalance = initialBalance;
		myAccountNumber = acctNum;
		if (myBalance < 0) {
			throw new IllegalArgumentException("Negative balance in account " + myAccountNumber);
		}
	}

	/**
	 * 
	 * @return myBalance
	 */
	public double getBalance() {
		return myBalance;
	}

	/**
	 * 
	 * @param amount - amount to add
	 * @throws IllegalArgumentException
	 */
	public void deposit(double amount) throws IllegalArgumentException {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount deposited in account " + myAccountNumber);
		}
		myBalance += amount;
	}

	/**
	 * 
	 * @param amount - amount to withdraw
	 * @throws IllegalArgumentException - exception if overdrawn
	 */
	public void withdraw(double amount) throws IllegalArgumentException {
		if (myBalance - amount < 0) {
			throw new IllegalArgumentException("Account " + myAccountNumber + " overdrawn");
		} else {
			myBalance -= amount;
		}
	}

}
