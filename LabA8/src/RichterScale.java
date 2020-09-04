/**
 * 
 * @author Aaditya Bhoota
 * period 3
 */

public class RichterScale {
	/**
	 * getEffect method - Prints the severity of the earthquake given the Richter value
	 * @param richter - Value of how sever the earthquake was on Richter Scale
	 */
	public static void getEffect(double richter) {		
		if (richter >= 8) {
			System.out.println("Most structures fall");
		}
		else if (richter >= 7) {
			System.out.println("Many buildings destroyed");
		}
		else if (richter >= 6) {
			System.out.println("Many buildings considerably damaged, some collapse");
		}
		else if (richter >= 4.5) {
			System.out.println("Damage to poorly constructed buildings");
		}
		else {
			System.out.println("No destruction of buildings");
		}
	}
}