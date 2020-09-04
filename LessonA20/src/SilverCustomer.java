/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period 3
 */
public class SilverCustomer extends Customer {
    final double SERVICE_DISCOUNT_RATE = 0.10;

    //Do not add any more fields
    //Add your methods along with documentation here

    /**
     *
     * @param n name
     */
    public SilverCustomer(String n) {
        super(n);
        super.setMemberType("Silver");
        super.setMember(true);
        super.setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
    }
}