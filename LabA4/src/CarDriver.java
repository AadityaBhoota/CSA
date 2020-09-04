/**
 * 
 * @author Aaditya Bhoota
 * period 3
 */
import java.util.Scanner;


public class CarDriver {
	public static void main(String[] args) {
		//your code goes here
		System.out.println("MPG Lab 2019-20");
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("New car odometer reading: ");
		int startOdometer = scan.nextInt();
		Car c = new Car(startOdometer);
		
		System.out.println("Filling Station Visit: ");
		System.out.printf("odometer reading: ");
		int currentOdometer = scan.nextInt();
		System.out.printf("gallons to fill tank: ");
		double gallonsConsumed = scan.nextDouble();
		System.out.println();
		c.fillUp(currentOdometer, gallonsConsumed);
		double mpg = c.calculateMPG();
		System.out.printf("Miles per Gallon: %.2f\n\n", mpg);
		c.resetMPG();
		
		System.out.println("Filling Station Visit: ");
		System.out.printf("odometer reading: ");
		currentOdometer = scan.nextInt();
		System.out.printf("gallons to fill tank: ");
		gallonsConsumed = scan.nextDouble();
		System.out.println();
		c.fillUp(currentOdometer, gallonsConsumed);
		mpg = c.calculateMPG();
		System.out.printf("Miles per gallon: %.2f\n\n", mpg);
		c.resetMPG();
		
		scan.close();
	}

}