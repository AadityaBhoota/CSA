/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period 3
 */
public abstract class Customer {
    private String name;
    private boolean member;
    private String memberType = "";
    private final double PRODUCT_DISCOUNT_RATE = 0.1;
    private double serviceDiscountRate;

    //Do not add any more fields
    //Add all your methods along with their documentation here

    /**
     *
     * @param n name
     */
    public Customer(String n) {
        name = n;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return member status
     */
    public boolean isMember() {
        return member;
    }

    /**
     * @return product discount rate
     */
    public double getProductDiscountRate() {
        return PRODUCT_DISCOUNT_RATE;
    }

    /**
     * @param price price of product
     * @return discounted price
     */
    public double getProductDiscount(double price) {
        return price * PRODUCT_DISCOUNT_RATE;
    }

    /**
     * @return member type
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * @return service discount rate
     */
    public double getServiceDiscountRate() {
        return serviceDiscountRate;
    }

    /**
     * @param price price of service
     * @return discounted service price
     */
    public double getServiceDiscount(double price) {
        return price * serviceDiscountRate;
    }

    /**
     * @param rate service discount rate
     */
    public void setServiceDiscountRate(double rate) {
        serviceDiscountRate = rate;
    }

    /**
     * @param type type of member
     */
    public void setMemberType(String type) {
        memberType = type;
    }

    /**
     * @param status status of member
     */
    public void setMember(boolean status) {
        member = status;
    }

    /**
     * @return details of customer as a string
     */
    public String toString(){
        String s = String.format("customer: %s\nMembership type: %s\n", getName(), getMemberType());
        return s;
    }
}