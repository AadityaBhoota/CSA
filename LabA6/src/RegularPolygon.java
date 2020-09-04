/**
 * class RegularPolygon - class to model any regular polygon
 * 
 * @author Aaditya Bhoota Period 3
 * 
 */

public class RegularPolygon {
	private int myNumSide;
	private double mySideLength;
	private double myR;
	private double myr;

	// Your code goes here

	/**
	 * default constructor
	 */
	public RegularPolygon() {
		myNumSide = 3;
	}

	/**
	 * 
	 * @param numSides   number of sides in polygon
	 * @param sideLength length of each side in polygon
	 */
	public RegularPolygon(int numSides, double sideLength) {
		myNumSide = numSides;
		mySideLength = sideLength;
		calcr();
		calcR();
	}

	/**
	 * calculates inscribed circle radius
	 */
	private void calcr() {
		myr = 0.5 * mySideLength * (1 / Math.tan(Math.PI / myNumSide));
	}

	/**
	 * calculates circumscribed circle radius
	 */
	private void calcR() {
		myR = 0.5 * mySideLength * (1 / Math.sin(Math.PI / myNumSide));
	}

	/**
	 * 
	 * @return returns vertex angle of polygon
	 */
	public double vertexAngle() {
		return ((myNumSide - 2.0) / myNumSide) * 180;
	}

	/**
	 * 
	 * @return returns perimeter of polygon
	 */
	public double Perimeter() {
		return myNumSide * mySideLength;
	}

	/**
	 * 
	 * @return returns area of polygon
	 */
	public double Area() {
		return 0.5 * myNumSide * Math.pow(myR, 2) * Math.sin(2 * Math.PI / myNumSide);
	}

	/**
	 * 
	 * @return returns number of sides
	 */
	public int getNumside() {
		return myNumSide;
	}

	/**
	 * 
	 * @return returns side length
	 */
	public double getSideLength() {
		return mySideLength;
	}

	/**
	 * 
	 * @return returns radius of circumscribed circle
	 */
	public double getR() {
		return myR;
	}

	/**
	 * 
	 * @return returns radius of inscribed circle
	 */
	public double getr() {
		return myr;
	}

}