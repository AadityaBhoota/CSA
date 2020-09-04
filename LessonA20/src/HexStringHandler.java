import javax.xml.validation.ValidatorHandler;

/**
 * Last Name: Bhoota
 * First Name: Aaditya
 * Student ID: 12110538
 * Period: 3
 * Implements the StringParser interface to parse
 * a string that contains a hex number into its
 * decimal equivalent
 * Implements the Validator interface to determine
 * validity of the string
 */
public class HexStringHandler implements Validator, StringHandler {
    boolean validHex;
    int decimalValue;

    /**
     *
     */
    public HexStringHandler() {
        validHex = true;
        decimalValue = 0;
    }

    /**
     *
     * @return validHex
     */
    public boolean isValid() {
        return validHex;
    }

    @Override
    public void processLetter(char c) {
        int val = c - 'A' + 10;
        if (val >= 10 && val <= 15) {
            decimalValue = 16 * decimalValue + val ;
        } else {
            validHex = false;
        }
    }

    @Override
    public void processDigit(char c) {
        int val = c - 48;
        decimalValue = 16 * decimalValue + val;
    }

    @Override
    public void processOther(char c) {
        validHex = false;
    }

    /**
     * @return decimalValue
     */
    public int getDecimalValue() {
        return validHex ? decimalValue : -1;
    }
}