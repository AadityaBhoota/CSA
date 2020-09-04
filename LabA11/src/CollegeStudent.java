/**
 * 
 * @author Aaditya Bhoota Period 3
 *
 */

public class CollegeStudent extends Student {
	private String major;
	private int year;

	/**
	 * 
	 * @param name   - name of student
	 * @param age    - age of student
	 * @param gender - gender of student
	 * @param idNum  - id of student
	 * @param gpa    - gpa of student
	 * @param year   - year of college student
	 * @param major  - major of college student
	 */
	public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
		super(name, age, gender, idNum, gpa);
		this.setMajor(major);
		this.setYear(year);
	}

	/**
	 * 
	 * @return year - return year of college student
	 */
	public int getYear() {
		return year;
	}

	/**
	 * 
	 * @param year - set year of college student
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 
	 * @return major- return major of college student
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * 
	 * @param major - set major of college student
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return super.toString() + ", year: " + year + ", major: " + major;
	}

}