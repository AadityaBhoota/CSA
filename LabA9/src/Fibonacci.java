/**
 *   
 * @author Aaditya Bhoota
 * Period 3
 */

 
public class Fibonacci {
	
	/**
	 * Returns the Fibonacci number given the specific index in the sequence
	 * @param n - Index in sequence
	 * @return - returns fiboacci number or returns the sum of the fibonacci numbers of the previous 2 indexes
	 */
	public int fib(int n)
	{
		//Your code goes here
		if (n == 1 || n == 0) {
			return n;
		}
		
		return fib(n-1) + fib(n - 2); 
	}//end method

}//end class