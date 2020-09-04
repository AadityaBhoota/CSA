import java.util.*;

/**
 * 
 * @author Aaditya Bhoota Period 3
 * 
 */

public class Grades {
	private Scanner stdin = new Scanner(System.in);
	private double gpa;
	private boolean hasF;
	private boolean moreThan4 = false;

	/**
	 * Method to get the grades and calculate the GPA This method also counts the
	 * number of classes taken and the number of Fs
	 */
	public void getGradesAndCalculateGPA() {
		double sum = 0;
		System.out.print("Enter your grades: ");
		String grade = stdin.next().toLowerCase();
		int count = 0;
		while (grade.equals("a") || grade.equals("b") || grade.equals("c") || grade.equals("d") || grade.equals("f")) {
			count++;
			if (grade.equals("a")) {
				sum += 4;
			} else if (grade.equals("b")) {
				sum += 3;
			} else if (grade.equals("c")) {
				sum += 2;
			} else if (grade.equals("d")) {
				sum += 1;
			} else if (grade.equals("f")) {
				sum += 0;
				hasF = grade.equals("f");
			}

			grade = stdin.next().toLowerCase();

		}
		moreThan4 = count >= 4;
		gpa = sum / count;
		System.out.printf("GPA = %.2f\n", gpa);
	}

	/**
	 * Method to print the appropriate message
	 */
	public void printMessage() {
		if (gpa >= 2 && moreThan4 && !hasF) {
			System.out.println("Eligible");
		} else {
			System.out.print("Ineligible, ");
			if (!moreThan4) {
				System.out.println("taking less than 4 classes");
			} else if (hasF && gpa >= 2) {
				System.out.println("gpa above 2.0 but has F grade");
			} else if (gpa < 2 && hasF) {
				System.out.println("gpa below 2.0 and has F grade");
			} else if (gpa < 2) {
				System.out.println("gpa below 2.0");
			}
		}
		hasF = false;
	}

}