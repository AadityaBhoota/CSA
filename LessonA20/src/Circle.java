/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period: 3
 */
public class Circle implements Measurable {
    private double radius;

    /**
     *
     * @param r - radius of circle
     */
    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    /**
     * @return area
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     *
     * @return object as string
     */
    public String toString() {
        String s = String.format("Circle:\n%7sradius =  %f\n%7scircumference = %f\n%7sarea = %f\n", "", radius, "", getPerimeter(), "", getArea());
        return s;
    }
}