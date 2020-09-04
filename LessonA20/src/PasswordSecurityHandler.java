/**
 * Last name:
 * First name:
 * Student ID:
 * Period:
 * Implements methods of the StringHandler interface to parse a String
 * containing a password
 *
 */
public class PasswordSecurityHandler implements StringHandler{
    int length;
    boolean digit;
    boolean otherCharacter;

    /**
     *  default constructor
     */
    public PasswordSecurityHandler() {
        length = 0;
        digit = false;
        otherCharacter = false;
    }
    @Override
    public void processLetter(char c) {
        length ++;
    }

    @Override
    public void processDigit(char c) {
        length ++;
        digit = true;
    }

    @Override
    public void processOther(char c) {
        length ++;
        otherCharacter = true;
    }

    /**
     *
     * @return returns security level
     */
    public String securityLevel() {
        if (length >= 8 && digit && otherCharacter) {
            return "strong";
        } else if (length >= 6) {
            return "medium";
        } else {
            return "weak";
        }
    }
}