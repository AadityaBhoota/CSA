/**
 * @author aaditya
 * last name: Bhoota
 * first name: Aaditya
 * Student ID: 12110538
 * period: 3
 */
public class Word {
    int count;
    String word;

    /**
     * Default constructor
     */
    public Word() {
        word = "";
        count = 0;
    }

    /**
     * Parameter constructor
     *
     * @param s - word as a string
     */
    public Word(String s) {
        word = s;
        count = 1;
    }

    /**
     * @return word as a string
     */
    public String getWord() {
        return word;
    }

    /**
     * @param s - string of word
     */
    public void setString(String s) {
        word = s;
    }

    /**
     * @return - number of instances word appears
     */
    public int getCount() {
        return count;
    }

    /**
     * increases counter
     */
    public void incrementCount() {
        count++;
    }

    /**
     * decreases counter
     */
    public void decrementCount() {
        count--;
    }

    /**
     * @param w - Word object to be compared with
     * @return - returns difference in ascii values of string
     */
    public int compareTo(Word w) {
        return this.getWord().toLowerCase().compareTo(w.getWord().toLowerCase());
    }

}