/**
 * 
 * @author Aaditya Bhoota
 * Period: 3
 *
 */

/** 
 * creates a car object with a make, model, licensePlate, and rental code
 */
public class CarRental {
	//Declare instance variables here
	

	String make, model, licensePlate, code;
	
	/**
	 * 
	 * @param make - Company of the car
	 * @param model - Version of the car
	 * @param licensePlate - car's license plate
	 */
	public CarRental(String make, String model, String licensePlate)
	{
		//Your code goes here
		this.make = make;
		this.model = model;
		this.licensePlate = licensePlate;
		computeCode();

	}
	/**
	 * ComputeCode - calculates the rental code
	 */
	public void computeCode()
	{
		char letter1 = licensePlate.charAt(0);
		char letter2 = licensePlate.charAt(1);
		char letter3 = licensePlate.charAt(2);
		int sumOfLetters = letter1 + letter2 + letter3;
		char num1 = licensePlate.charAt(4);
		char num2 = licensePlate.charAt(5);
		char num3 = licensePlate.charAt(6);
		int sumOfNumbers = (num1 - 48) * 100 + (num2 - 48) * 10 + num3 - 48;
		int totalSum = sumOfNumbers + sumOfLetters;
		char letter = (char) ('A' + totalSum % 26);
		code = letter + "" + totalSum;
		
	}
	/**
	 *  Returns the code variable
	 * @return - returns the code as a string
	 */
	public String getCode()
	{
		return code;//change this
	}

	/**
	 * @return - returns string of all variables
	 */
	public String toString()
	{
		//Your code goes here
		return "Make = " + make + "\n Model = " + model + "\n" + licensePlate + " = " + getCode();//change this
	}

	
}