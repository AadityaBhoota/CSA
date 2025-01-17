
/**
 * Simulates a grocery receipt generated by a clerk
 * 
 * @author Aaditya Bhoota period 3
 *
 */
public class GroceryReceipt {
	private Employee clerk;// Employee object representing the clerk generating the receipt
	private String receipt;// List of items
	private double total;// Total price

	/**
	 * Initializes the clerk to the passed in employee, the receipt to an empty
	 * string and total to 0
	 * 
	 * @param clerk - employee generating this receipt
	 */
	public GroceryReceipt(Employee clerk) {
		total = 0;
		receipt = "";
		this.clerk = clerk;
	}

	/**
	 * Returns the total amount on this receipt in dollars and cents
	 * 
	 * @return total amount
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * Returns the clerk generating the information
	 * 
	 * @return clerk
	 */
	public Employee getClerk() {
		return clerk;
	}

	/**
	 * Returns the list of items
	 * 
	 * @return receipt
	 */
	public String getReceipt() {
		return receipt;
	}

	/**
	 * Adds the given item to the receipt Updates the total by adding in the the
	 * items price
	 * 
	 * @param i - grocery item to be added
	 */
	public void add(Item i) {
		total += i.getPrice();
		receipt += i.toString() + "\n";
	}

	/**
	 * Returns the value passed as a string in the dollar and cents format ####.##
	 * 
	 * @param value - value to be converted to dollar and cents format
	 * @return String in dollar and cents format
	 */
	public String valueToString(double value) {
		String val = String.format("%.2f", value);
		return val;
	}

	/**
	 * Returns a string with list of items (one per line) and total receipt amount
	 * 
	 * @return a string with list of items and total receipt amount
	 */

	public String toString() {
		return receipt + "\nTotal: $" + valueToString(total);
	}

}