/**
 * 
 * @author Aaditya Bhoota
 * period 3
 *
 */
public class Point {
	// Place your instance variables here
	private double x, y;

	/**
	 * Default constructor initializes to origin
	 */
	public Point() {
		// Your code goes here
		x = 0;
		y = 0;
	}

	/**
	 * Parameter constructor initializes to given x and y coordinate
	 * 
	 * @param myX - x coordinate
	 * @param myY - y coordinate
	 */
	public Point(double myX, double myY) {
		// Your code goes here
		x = myX;
		y = myY;

	}

	/**
	 * Parameter constructor initializes this point to the coordinates of given
	 * point
	 * 
	 * @param p - Another point
	 * 
	 */
	public Point(Point p) {
		// Your code goes here
		x = p.x;
		y = p.y;
	}

	/**
	 * Returns the x coordinate of this point
	 * 
	 * @return x coordinate
	 */
	public double getX() {
		// Your code goes here
		return x;
	}

	/**
	 * Returns the y coordinate of this point
	 * 
	 * @return y coordinate
	 */
	public double getY() {
		// Your code goes here
		return y;
	}

	/**
	 * Sets the x coordinate of this point
	 * 
	 * @param myX - x coordinate
	 */
	public void setX(double myX) {
		// Your code goes here
		x = myX;

	}

	/**
	 * Sets the y coordinate of this point
	 * 
	 * @param myY - y coordinate
	 */
	public void setY(double myY) {
		// Your code goes here
		y = myY;
	}

	/**
	 * Sets the x and y coordinate of this point
	 * 
	 * @param myX - x coordinate
	 * @param myY - y coordinate
	 */
	public void setXY(double myX, double myY) {
		// Your code goes here
		x = myX;
		y = myY;
	}

	/**
	 * Sets the x and y coordinates of this point using a different point object
	 * 
	 * @param p - other point object 
	 */
	public void setPoint(Point p) {
		// Your code goes here
		x = p.x;
		y = p.y;
	}

	/**
	 * Determines the quadrant 0 (origin), 1, 2, 3, or 4 where this point lies
	 * 
	 * @return quadrant number or 0 if it is the origin
	 */
	public int quadrant() {
		// Your code goes here
		if (x > 0) {
			if (y > 0) {
				return 1;
			}
			if (y < 0) {
				return 4;
			}
		} else if (x < 0) {
			if (y > 0) {
				return 2;
			}
			if (y < 0) {
				return 3;
			}
		}
		return 0;
	}

	/**
	 * Finds and returns the distance between this point and given x and y
	 * coordinate
	 * 
	 * @param otherX - x coordinate of other point
	 * @param otherY - y coordinate of other point
	 * @return distance between this point and other point
	 */
	public double distance(double otherX, double otherY) {
		// Your code goes here
		double distance = Math.sqrt(Math.pow((x - otherX), 2) + Math.pow((y - otherY), 2));
		return distance;
	}

	/**
	 * Finds and returns the distance between this point and other given point
	 * 
	 * @param other - other point
	 * @return distance between this point and other given point
	 */
	public double distance(Point other) {
		// Your code goes here
		double distance = Math.sqrt(Math.pow((x - other.x), 2) + Math.pow((y - other.y), 2));
		return distance;
	}

	/**
	 * Determines if this point is equal to another given point
	 * 
	 * @param p another point to compare to
	 * @return true if the two points are the same, false otherwise
	 */
	public boolean equals(Point p) {
		// Your code goes here
		if (x == p.x && y == p.y) {
			return true;
		}
		return false;
	}

	/**
	 * Compares the distance between this point and points p1 and p2 Returns the
	 * point that is farthest
	 * 
	 * @param p1 first point
	 * @param p2 second point
	 * @return point that is farthest away null if they are equidistant
	 */
	public Point whichIsFarther(Point p1, Point p2) {
		// Your code goes here
		if (distance(p1) > distance(p2)) {
			return p1;
		}
		else if (distance(p2) > distance(p1)) {
			return p2;
		}
		return null;

	}

	/**
	 * Creates a formatted String of the object
	 * 
	 * @return point as a formatted string
	 */
	public String toString() {
		return "(" + String.format("%.2f", getX()) + ", " + String.format("%.2f", getY()) + ")";
	}
}