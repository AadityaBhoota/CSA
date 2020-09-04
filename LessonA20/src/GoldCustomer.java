/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period 3
 */
public class GoldCustomer extends Customer {
    final double SERVICE_DISCOUNT_RATE = 0.15;

    //Do not add any more fields
    //Add your methods along with their documentation

    /**
     *
     * @param n name
     */
    public GoldCustomer(String n) {
        super(n);
        super.setMemberType("Gold");
        super.setMember(true);
        super.setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
    }
}