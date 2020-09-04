import java.util.ArrayList;

/**
 * Last name: Bhoota
 * First name: Aaditya
 * Student ID: 12110538
 * Period: 3
 */
public class MeasurableDriver {
    /**
     *
     * @param args string arguments
     */
    public static void main(String[] args) {
        ArrayList<Measurable> list = new ArrayList<>();
        list.add(new Circle(1));
        list.add(new Rectangle(1, 1));
        list.add(new Triangle(3, 4, 5));
        list.add(new SingingRectangle(2, 2));
        list.add(new Circle(1.5));
        list.add(new Rectangle(1, 1.5));
        list.add(new Triangle(7, 24, 25));
        list.add(new Circle(2));
        list.add(new Rectangle(2, 3));
        list.add(new Triangle(11, 60, 61));
        for (Measurable shape : list) {
            System.out.println(shape);
        }
    }
}
