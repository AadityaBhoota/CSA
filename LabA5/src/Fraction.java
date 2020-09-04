/*
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * @Author: Aaditya Bhoota
 * period: 3
 */

public class Fraction {

	// ****************** Instance variables ******************

	private int num; // numerator
	private int denom; // denominator
	
	// Default constructor
	public Fraction(){
	   denom = 1;
	}
	// Parameter constructor
	public Fraction(int n){
	   num = n;
	   denom = 1;
	}
	// Parameter constructor
	public Fraction(int n, int d){
	   num = n;
	   denom = d;
	   reduce();
	}
	// Parameter constructor
	public Fraction(Fraction other){
	   num = other.num;
	   denom = other.denom;
	   reduce();
	}
	// Getters
	public int getNumerator(){
	   return num;
	}
	
	public int getDenominator(){
	   return num;
	}
	
	public double getValue() {
		return (double) (num)/denom;
	}
	// Setters
	public void setNumerator(int n) {
		num = n;
		reduce();
	}
	
	public void setDenomoinator(int d) {
		denom = d;
		reduce();
	}
	
	public void setFraction(Fraction other) {
		num = other.num;
		denom = other.denom;
		reduce();
	}
	// Add method that takes Fraction object as parameter
	public Fraction add(Fraction other) {
	   Fraction f = new Fraction();
	   f.num = other.denom*num + denom*other.num;
	   f.denom = other.denom * denom;
	   f.reduce();
		return f;
	}
	// Add method that takes int as parameter
	public double add(int n) {
		reduce();
		return (double)(num)/denom + n;
	}
	// Multiply method that takse Fraction object as parameter
	public Fraction multiply(Fraction other) {
	   Fraction f = new Fraction();
	   f.num = other.num * num;
	   f.denom = other.denom * denom;
	   f.reduce();
		return f;
	}
	// Add method that takes int as parameter
	public double multiply(int n) {
		reduce();
		return (double)(num)/denom * n;
	}
	// Reduce method
	public void reduce() {
		if (denom < 0) {
			num = -num;
			denom = -denom;
		}
		int gcf = MyMathLib.gcf(Math.abs(num), denom);
	    num = num/gcf;
	    denom = denom/gcf;
	}
	// To String method
	public String toString() {
		return num + "/" + denom;
	}
}