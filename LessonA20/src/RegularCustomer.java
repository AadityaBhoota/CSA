/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period 3
 */
public class RegularCustomer extends Customer {
    //Add your methods along with documentation here

    /**
     * n
     * @param n name
     */
    public RegularCustomer(String n) {
        super(n);
        super.setMemberType("Not a member");
        super.setMember(false);
        super.setServiceDiscountRate(0);
    }

}