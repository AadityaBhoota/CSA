/**
 * 
 * @author aaditya Bhoota
 *
 */
public interface Checker 
{
	/** @param text a string to consider for acceptance
	 * @return true if this Checker accepts text; false otherwise
	 */
	boolean accept(String text);

}// end interface Checker