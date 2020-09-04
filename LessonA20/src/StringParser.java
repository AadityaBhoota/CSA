/**
 * Last name:
 * First name:
 * Student ID:
 * Period:
 * This class does some generic string parsing of a String one character at a time
 * For each character, the appropriate method of the StringHandler interface is called.
 */
public class StringParser {
    //Instance variable goes here
    StringHandler str;

    /**
     * Constructor initializes the handler
     *
     * @param h - an object that implements the StringHandler interface
     */
    public StringParser(StringHandler h) {
        str = h;
    }

    /**
     * Parses the string one character at a time. Calls the appropriate
     * method if the character is a digit, letter, or neither
     *
     * @param s - string to parse
     */
    public void parse(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                str.processLetter(c);
            } else if (Character.isDigit(c)) {
                str.processDigit(c);
            } else {
                str.processOther(c);
            }
        }
    }
}