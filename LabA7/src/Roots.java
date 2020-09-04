/**
 * @author Aaditya Bhoota
 * period 3
 */
import java.util.Scanner;

public class Roots {
	Scanner stdin = new Scanner(System.in);
	private double a1, b1, c1, a2, b2, c2, a3, b3, c3, root1a, root1b, root2a, root2b, root3a, root3b;

	
	/**
	 * calculate the roots of quadratic equations
	 */
	public void calculate() 
	{	
		//your code goes here
		System.out.printf("Enter the coefficients a b and c for equation 1: ");
		a1 = stdin.nextDouble();
		b1 = stdin.nextDouble();
		c1 = stdin.nextDouble();
		System.out.printf("Enter the coefficients a b and c for equation 2: ");
		a2 = stdin.nextDouble();
		b2 = stdin.nextDouble();
		c2 = stdin.nextDouble();
		System.out.printf("Enter the coefficients a b and c for equation 3: ");
		a3 = stdin.nextDouble();
		b3 = stdin.nextDouble();
		c3 = stdin.nextDouble();
		
		root1a = (- b1 + Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
		root1b = (- b1 - Math.sqrt(b1 * b1 - 4 * a1 * c1)) / (2 * a1);
		root2a = (- b2 + Math.sqrt(b2 * b2 - 4 * a2 * c2)) / (2 * a2);
		root2b = (- b2 - Math.sqrt(b2 * b2 - 4 * a2 * c2)) / (2 * a2);
		root3a = (- b3 + Math.sqrt(b3 * b3 - 4 * a3 * c3)) / (2 * a3);
		root3b = (- b3 - Math.sqrt(b3 * b3 - 4 * a3 * c3)) / (2 * a3);
		
		System.out.printf("%20s%10s%10s%11s%11s\n", "a:", "b:", "c:", "root1:", "root2:");
		System.out.printf("%10s%10.2f%10.2f%10.2f%10.2f%10.2f\n", "#1", a1, b1, c1, root1a, root1b);
		System.out.printf("%10s%10.2f%10.2f%10.2f%10.2f%10.2f\n", "#2", a2, b2, c2, root2a, root2b);
		System.out.printf("%10s%10.2f%10.2f%10.2f%10.2f%10.2f\n", "#3", a3, b3, c3, root3a, root3b);
	}
}