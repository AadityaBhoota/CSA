/**
 * 
 * @author Aaditya Bhoota
 * Period: 3
 *
 */

/** A String util class
 */
public class StringUtil1 
{	//Declare instance variables here
	
	
	/**
	 * 
	 * @param str - the string to be reversed
	 * @return - returns reversed string
	 */
	public static String reverse(String str)
	{
		if (str.length() <= 1) {
		   return str;
		}
 		return str.substring(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
		
	}
	/**
	 * 
	 * @param str - string to be modified
	 * @return - returns modified string
	 */
	private static String stripExtra(String str) {
	   if (str.length() == 0) {
		   return str;
		}
		 if ( !((int) str.charAt(0) >= 48 && (int) str.charAt(0) <= 57) && 
	   !((int) str.charAt(0) >= 65 && (int) str.charAt(0) <= 90) &&
	   !((int) str.charAt(0) >= 97 && (int) str.charAt(0) <= 122)) {
	      return stripExtra(str.substring(1));
		}
 		return "" + str.charAt(0) + stripExtra(str.substring(1));
	}
	/**
	 * 
	 * @param str - string being checked if palindrome
	 * @return - returns true if palindrome
	 */
	public static boolean palindrome(String str) {  
		if (StringUtil1.stripExtra(str.toLowerCase()).equals(StringUtil1.stripExtra(StringUtil1.reverse(str.toLowerCase())))){
		   return true;
		}
		return false;
		
	}
	/**
	 * 
	 * @param s - string to be modified
	 * @return - returns modified string
	 */

	public static String shorthand(String s)
	{
	   if (s.length() == 0) {
	      return s;
	   }
	   
	   if (!(s.indexOf(" ") < 0)) {
	      if (s.substring(0, 2).toLowerCase().equals("to")){
	         return "2" + shorthand(s.substring(2));
	      }
	      else if (s.substring(0, 3).toLowerCase().equals("and")) {
	         return "&" + shorthand(s.substring(3));
	      }
	      else if (s.substring(0, 3).toLowerCase().equals("f" + "or")) {
	         return "4" + shorthand(s.substring(3));
	      }
	      else if (s.substring(0, 3).toLowerCase().equals("you")) {
	         return "" + shorthand(s.substring(3));
	      }
	   }
		if (s.substring(0,1).toLowerCase().equals("a") || s.substring(0,1).toLowerCase().equals("e") 
		|| s.substring(0,1).toLowerCase().equals("i") || s.substring(0,1).toLowerCase().equals("o") 
		|| s.substring(0,1).toLowerCase().equals("u")){
		   return shorthand(s.substring(1));
		}
		
		
		return s.substring(0,1) + shorthand(s.substring(1));
		
		
	}
}