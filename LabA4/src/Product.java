/**
 * 
 * @author Aaditya Bhoota
 * Period  3
 *
 */
public class Product {
	//Your class variables go here
	private static String companyName;
	private String name;
	private double cost;
	private double unitPrice;
	private double discount;
	private double unitSalePrice;
	private int quantitySold;

	/**
	 * Default constructor sets all numeric values to 0 and strings to empty strings
	 */
	//Your default constructor goes here
	public Product() {
		name = "";
		cost = 0;
		unitPrice = 0;
		unitSalePrice = 0;
		quantitySold = 0;
	}


	/**
	 * Constructor to initialize all the fields and calculate the sale price
	 * after discount
	 * 
	 * @param pName
	 *            - product name
	 * @param pCost
	 *            - product cost
	 * @param price
	 *            - product sale price before discount
	 * @param pDiscount
	 *            - percent discount
	 * @param qty 
	 * 			  - quantity sold
	 */
	//Your overloaded parameter constructor with 5 parameters goes here. 
	//The fields are initialized as described above when there is a discount and calculate 
	//the sale price
	public Product(String name, double cost, double unitPrice, double discount, int quantitySold) {
		this.name = name;
		this.cost = cost;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.unitSalePrice = calculateSalePrice();
		this.quantitySold = quantitySold;
	}
	
	
	
	
	/**
	 * Constructor to initialize all the fields and calculate the sale price
	 * when there is no discount
	 * 
	 * @param pName
	 *            - product name
	 * @param pCost
	 *            - product cost
	 * @param price
	 *            - product sale price before discount
	 * @param qty 
	 * 			  - quantity sold
	 */
	//Your overloaded parameter constructor with 4 parameters goes here. 
	//The fields are initialized as described above when there is NO discount and calculate 
	//the sale price
	public Product(String name, double cost, double unitPrice, int quantitySold) {
		this.name = name;
		this.cost = cost;
		this.unitPrice = unitPrice;
		this.unitSalePrice = unitPrice;
		this.quantitySold = quantitySold;
	}
	
	/**
	 * Calculates the sale price after applying the discount
	 * 
	 * @return sale price after discount
	 */
	//Your method to calculate sale price goes here
	private double calculateSalePrice() {
		unitSalePrice = unitPrice * ((100 - discount)/100);
		return unitSalePrice;
	}
	
	/* Modifier methods */
	/**
	 * Modifies the name of the product
	 * 
	 * @param name
	 *            - new product name
	 */
	//Your method to set the product name goes here
	public void setCompany(String companyName){
		Product.companyName = companyName;
	}
	
	/**
	 * Modifies the cost of the product
	 * 
	 * @param pCost
	 *            - new product cost
	 */
	//Your method to set the cost of the product goes here
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Modifies the sale price before discount
	 * 
	 * @param price
	 *            new sale price before discount
	 */
	//Your method to set the sale price before discount goes here
	public void setPrice(double unitPrice) {
		this.unitPrice = unitPrice;
		this.unitSalePrice = calculateSalePrice();
	}
	
	/**
	 * Modifies the discount rate and recalculates the sale price after applying
	 * the new discount
	 * 
	 * @param pDiscount
	 *            - new percent discount
	 */
	//Your method to set the discount rate goes here.
	public void setDiscount(double discount) {
		this.discount = discount;
		this.unitSalePrice = calculateSalePrice();
	}

	/**
	 * Modifies the quantity sold
	 * 
	 * @param qty
	 *            - new quantity sold
	 */
	//Your method to set the quantity sold goes here
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	/**
	 * Sets the name of the company
	 * 
	 * @param cName
	 *            - name of the company
	 */
	//Your method to set the company name goes here
	public void setName(String name) {
		this.name = name;
	}

	/* Accessor Methods */
	/**
	 * Gets the product name
	 * 
	 * @return name of product
	 */
	//Your method to get the product name goes here
	public String getName() {
		return name;
	}

	/**
	 * Gets the cost of the product
	 * 
	 * @return cost of product
	 */
	//Your method to get the product cost goes here
	public double getCost() {
		return cost;
	}

	/**
	 * Gets the price of the product before discount
	 * 
	 * @return sale price before discount
	 */
	//Your method to get the product price before discount goes here
	public double getPrice() {
		return unitPrice;
	}
	
	/**
	 * Gets the discount rate
	 * 
	 * @return percent discount
	 */
	//Your method to get the discount rate goes here
	public double getDiscount() {
		return discount;
	}

	/**
	 * Gets the price after discount
	 * 
	 * @return price after discount
	 */
	//Your method to get the price after discount goes here
	public double getSalePrice() {
		return unitSalePrice;
	}

	/**
	 * Gets the quantity sold
	 * 
	 * @return quantity sold
	 */
	//Your code to get the quantity sold goes here
	public int getQuantitySold() {
		return quantitySold;
	}

	/**
	 * Returns the name of the company
	 * 
	 * @return name of the company
	 */
	//Your code to get the company name goes here
	public String getcompanyName(){
		return companyName;
	}
	
	/**
	 * Returns the profit earned on the product
	 * 
	 * @return difference between salePrice and cost
	 */
	//Your code to calculate and return the profit on one unit goes here
	public double unitProfit() {
		return unitSalePrice - cost;
	}

	/**
	 * Returns the profit earned on the given quantity of the product
	 * 
	 * @return profit earned on the number of units sold
	 */
	//Your code to calculate and return the profit on the given quantity sold goes here
	public double totalProfit() {
		return quantitySold * unitSalePrice - quantitySold * cost;
	}

	/**
	 * Method to return the product information as a string
	 */
	public String toString() {
		String s;
		s = companyName + "\n";
		s += "------------------------------------------------------\n";
		s += String.format("%s: \nCost           = $%8.2f\n", name, getCost());
		s += String.format("Price          = $%8.2f\n", getPrice());
		s += String.format("Discount       = %8.2f%s", getDiscount(), "%\n");
		s += String.format("Sale Price     = $%8.2f\n", getSalePrice());
		s += String.format("Quantity Sold  = $%8d\n", getQuantitySold());
		s += String.format("Profit/unit    = $%8.2f\n", unitProfit());
		s += String.format("Total Profit   = $%8.2f\n", totalProfit());
		return s;
	}
}