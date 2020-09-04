/**
 * 
 * @author aaditya Bhoota
 * Period 3
 */
public class CheckingAccountDriver {
	/**
	 * 
	 * @param args returns something
	 */
	public static void main(String[] args) {
		try {
			CheckingAccount acc1 = new CheckingAccount(-10.0, 100);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			try {
				CheckingAccount acc2 = new CheckingAccount(10.0, 102);
				acc2.deposit(-50);

			} catch (IllegalArgumentException a) {
				System.out.println(a.getMessage());
				try {
					CheckingAccount acc3 = new CheckingAccount(10.0, 103);
					acc3.withdraw(20);
				}
				catch (IllegalArgumentException b) {
					System.out.println(b.getMessage());
				}
			}
		}

	}
}