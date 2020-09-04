/**
 * @author last name: Bhoota
 * first name: Aaditya
 * student ID: 12110538
 * period 3
 */
public class Item {
    private int myId;
    private int myInv;

    /**
     * @param id  - id of item
     * @param inv - number of inventory of item
     */
    public Item(int id, int inv) {
        myId = id;
        myInv = inv;
    }

    /**
     * @return - returns myId
     */
    public int getId() {
        return this.myId;
    }

    /**
     * @return - returns myInv
     */
    public int getInv() {
        return this.myInv;
    }

    /**
     * @param other - Item being compared to
     * @return - returns difference in id values
     */
    public int compareTo(Item other) {
        return this.getId() - other.getId();
    }

    /**
     * @param other - Item being compared to
     * @return - true if same id, false if otherwise
     */
    public boolean equals(Item other) {
        return this.getId() == other.getId();
    }

    /**
     * @return - returns Item formatted as string
     */
    public String toString() {
        String s = String.format("%10d%10d", this.getId(), this.getInv());
        return s;
    }
}