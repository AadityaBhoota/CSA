/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period 3
 */
public class PremiumCustomer extends Customer {
    final double SERVICE_DISCOUNT_RATE = 0.2;

    //Do not add any more fields
    //Add your methods along with documentation here

    /**
     *
     * @param n name
     */
    public PremiumCustomer(String n) {
        super(n);
        super.setMemberType("Premium");
        super.setMember(true);
        super.setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
    }
}