import java.util.Scanner;

public class BankAccountDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create an account using default constructor
		BankAccount myAccount1 = new BankAccount();
		System.out.printf("%s %2d $%.2f", "Created an empty account #", myAccount1.getAccountNumber(),
				myAccount1.getBalance());
		System.out.println();
		// use
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the account number: ");
		int aNum = in.nextInt();
		System.out.print("Enter the starting balance: ");
		double bal = in.nextDouble();
		BankAccount myAccount2 = new BankAccount(aNum, bal);
		System.out.printf("%s %2d $%.2f", "Created another account #", myAccount2.getAccountNumber(),
				myAccount2.getBalance());
		System.out.println();

		myAccount1.deposit(1000);
		System.out.printf("%s %2d $%.2f", "Balance in account #", myAccount1.getAccountNumber(),
				myAccount1.getBalance());
		System.out.println();
		myAccount2.deposit(1000);
		System.out.printf("%s %2d $%.2f", "Balance in account #", myAccount2.getAccountNumber(),
				myAccount2.getBalance());
		System.out.println();
		myAccount1.withdraw(225.25);
		System.out.printf("%s %2d $%.2f", "Balance in account #", myAccount1.getAccountNumber(),
				myAccount1.getBalance());
		System.out.println();
		myAccount2.withdraw(434.30);
		System.out.printf("%s %2d $%.2f", "Balance in account #", myAccount2.getAccountNumber(),
				myAccount2.getBalance());
		System.out.println();

	}// end method main

}// end class
