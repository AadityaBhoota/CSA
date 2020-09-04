/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period: 3
 */
public class Triangle implements Measurable {
    double a, b, c;

    /**
     *
     * @param side1 - side 1
     * @param side2 - side 2
     * @param side3 - side 3
     */
    public Triangle(double side1, double side2, double side3) {
        a = side1;
        b = side2;
        c = side3;
    }

    @Override
    /**
     * @return perimeter
     */
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    /**
     * @return area
     */
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     *
     * @return object as string
     */
    public String toString() {
        String s = String.format("Triangle:\n%7sside1 = %.1f\n%7sside2 = %.1f\n%7sside3 = %.1f\n%7sperimeter = %.1f\n%7sarea = %.1f\n", "", a, "", b, "", c, "", getPerimeter(), "", getArea());
        return s;
    }
}