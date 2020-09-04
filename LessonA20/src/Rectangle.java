/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period: 3
 */
public class Rectangle implements Measurable {
    private double length;
    private double width;

    /**
     *
     * @param l - length
     * @param w - width
     */
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    /**
     * @return area
     */
    public double getArea() {
        return length * width;
    }

    /**
     *
     * @return object as string
     */
    public String toString() {
        String s = String.format("Rectangle:\n%7slength = %.1f\n%7swidth = %.1f\n%7sperimeter = %.1f\n%7sarea = %.1f\n", "", length, "", width, "", getPerimeter(), "", getArea());
        return s;
    }
}