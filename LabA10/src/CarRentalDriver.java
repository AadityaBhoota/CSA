import java.util.*;

/**
 *
 * @author Aaditya Bhoota
 * Period 3
 */
public class CarRentalDriver {
	/**
	 * Main method
	 * @param args Takes a string array parameter
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Make: ");
		String make = stdin.next();
		System.out.print("Model: ");
		String model = stdin.next();
		System.out.print("License Plate: ");
		String license = stdin.next() + " " + stdin.next();
		CarRental car = new CarRental(make, model, license);
		System.out.println(car.toString());
		
		System.out.print("Make: ");
		make = stdin.next();
		System.out.print("Model: ");
		model = stdin.next();
		System.out.print("License Plate: ");
		license = stdin.next() + " " + stdin.next();
		CarRental car2 = new CarRental(make, model, license);
		System.out.println(car2.toString());
		
		System.out.print("Make: ");
		make = stdin.next();
		System.out.print("Model: ");
		model = stdin.next();
		System.out.print("License Plate: ");
		license = stdin.next() + " " + stdin.next();
		CarRental car3 = new CarRental(make, model, license);
		System.out.println(car3.toString());
		

	}

}
