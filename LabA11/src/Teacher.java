/**
 * 
 * @author aaditya Bhoota Period 3
 */
public class Teacher extends Person {
	private String subject;
	private double salary;

	/**
	 * 
	 * @param name    - name of person
	 * @param age     - age of person
	 * @param gender  - gender of person
	 * @param subject - subject of teacher
	 * @param salary  - salary of teacher
	 */
	public Teacher(String name, int age, String gender, String subject, double salary) {
		super(name, age, gender);
		this.subject = subject;
		this.salary = salary;
	}

	/**
	 * 
	 * @return subject - returns subject of teacher
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * 
	 * @return salary= - returns salary of teacher
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param subject - subject to be set of teacher
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 
	 * @param salary - salary to be set of teacher
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + ", subject: " + subject + ", salary: " + salary;
	}
}
