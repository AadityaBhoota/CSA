/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period: 3
 */
public class SingingRectangle extends Rectangle {
    /**
     *
     * @param l length
     * @param w width
     */
    public SingingRectangle(double l, double w) {
        super(l, w);
    }

    /**
     *
     * @return overrided string method
     */
    public String toString() {
        String s = super.toString();
        s += String.format("%7sRectangle song:\n" +
                "%7sI'm a rectangle.\n" +
                "%7sYou can see.\n" +
                "%7sI have four sides.\n" +
                "%7sCount with me\n" +
                "%7s2 are short and 2 are long.\n" +
                "%7sCome along and sing my song.\n", "", "", "", "", "", "", "");
        return s;
    }
}