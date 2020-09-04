import java.util.ArrayList;
/**
 * @author aaditya
 * last name: Bhoota
 * first name: Aaditya
 * Student ID: 12110538
 * period: 3
 */
public class IndexedWord {
    private String word;
    private ArrayList<Integer> pageNumber = new ArrayList<Integer>();//list of pages
    /**
     * Constructs a new indexed word and adds the page number
     * @param w - word to index
     * @param p - page number
     */
    public IndexedWord(String w, int p){
        word = w;
        pageNumber.add(p);
    }
    /**
     * returns the word
     * @return index word
     */
    public String getWord(){
        return word;
    }
    /**
     * returns the list of page numbers
     * @return list of numbers
     */
    public ArrayList<Integer> getPageNumber(){
        return pageNumber;
    }
    /**
     * sets the word
     * @param w - word
     */
    public void setWord(String w){
        word = w;
    }
    /**
     * adds a page number to the list
     * @param p - page number
     */
    public void addPageNumber(int p){
        pageNumber.add(p);
    }
    /**
     * Returns a string of word and list of page numbers to print
     * @return word and page numbers as a String
     */
    public String toString(){
        String s = word + pageNumber;
        return s;
    }
}