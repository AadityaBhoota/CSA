import java.util.Date;

/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period 3
 */
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;//expense before discount
    private double productExpense;//expense before discount
    //Do not add any more fields
    //Add your methods along with documentation here

    /**
     *
     * @param c customer
     * @param d date
     * @param sExpense service expense b4 discount
     * @param pExpense product expense b4 discount
     */
    public Visit(Customer c, Date d, double sExpense, double pExpense) {
        customer = c;
        date = d;
        serviceExpense = sExpense;
        productExpense = pExpense;
    }

    /**
     *
     * @param serviceExpense service expense
     */
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    /**
     *
     * @param productExpense product expense
     */
    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    /**
     *
     * @return service expense after discount
     */
    public double getServiceExpense() {
        return serviceExpense - customer.getServiceDiscount(serviceExpense);
    }

    /**
     *
     * @return product expense after discount
     */
    public double getProductExpense() {
        return productExpense - customer.getProductDiscount(productExpense);
    }

    /**
     *
     * @return total expense after discount
     */
    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }

    /**
     *
     * @return visit as string
     */
    public String toString() {
        String s = String.format("Date: %s\n", date);
        s += "Invoice for " + customer.toString();
        s += String.format("Service charge (with %.1f%% discount): $%.2f\n", customer.getServiceDiscountRate() * 100, getServiceExpense());
        s += String.format("Product charge (with %.1f%% discount): $%.2f\n", customer.getProductDiscountRate() * 100, getProductExpense());
        s += String.format("Total: $%.2f\n", getTotalExpense());
        return s;
    }
}