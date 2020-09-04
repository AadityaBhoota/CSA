import java.util.ArrayList;

/**
 * @author aaditya
 * last name: Bhoota
 * first name: Aaditya
 * Student ID: 12110538
 * period: 3
 */
public class Book {
    ArrayList<IndexedWord> words = new ArrayList<IndexedWord>(); //list of indexed words
    ArrayList<String> ignoreList = new ArrayList<String>();//list of words to ignore
    //Do not add any other fields

    /**
     * Creates a list of ignored words
     */
    private void createIgnoreList() {
        //Do not modify this
        ignoreList.add("a");
        ignoreList.add("an");
        ignoreList.add("and");
        ignoreList.add("as");
        ignoreList.add("at");
        ignoreList.add("for");
        ignoreList.add("he");
        ignoreList.add("her");
        ignoreList.add("him");
        ignoreList.add("if");
        ignoreList.add("in");
        ignoreList.add("is");
        ignoreList.add("it");
        ignoreList.add("not");
        ignoreList.add("of");
        ignoreList.add("on");
        ignoreList.add("or");
        ignoreList.add("she");
        ignoreList.add("the");
        ignoreList.add("to");
        ignoreList.add("was");
        ignoreList.add("were");
        ignoreList.add("with");
        ignoreList.add("you");
        ignoreList.add("your");
        ignoreList.add("youre");
    }

    /**
     * Constructs a list of indexed words from a list of pages
     * The list of pages contains a list of words on each page
     * Also prints the list of indexed words
     *
     * @param book - list of pages where each page is a list of words
     */
    public Book(ArrayList<ArrayList<String>> book) {
        //Your code goes here
    }

    /**
     * Determines the index of the given word in the list of indexed words
     *
     * @param word - word to search for
     * @return index of the word in words
     */
    private int indexOf(String word) {
        int first = 0;
        int last = words.size() - 1;
        int mid;
        while (first <= last) {
            mid = (first + last) / 2;
            if (words.get(mid).getWord().equals(word)) {
                return mid;
            } else if (words.get(mid).getWord().compareTo(word) > 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
    }

    /**
     * Returns a string of indexed words along with the list of pages
     * it occurs on. Each word is on a separate line
     *
     * @return list of words along with their page numbers
     */
    public String toString() {
        String s = "";
        for (IndexedWord w : words) {
            s += w + "\n";
        }
        return s;
    }

    /**
     * Performs merge sort on the given list of words
     *
     * @param list - list of words to sort
     */
    public void Sort(ArrayList<String> list) {
        mergeSort(words, 0, words.size() - 1);
    }

    /**
     * Recursive merge sort of an array of integers
     *
     * @param a     reference to an array of integers to be sorted
     * @param first starting index of range of values to be sorted
     * @param last  ending index of range of values to be sorted
     */
    public void mergeSort(ArrayList<Comparable> a, int first, int last) {
        if (last - first >= 1) {
            int mid = (last + first) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid + 1, last);
        }
    }

    /**
     * Takes in entire vector, but will merge the following sections together: Left
     * sublist from a[first]..a[mid], right sublist from a[mid+1]..a[last].
     * Precondition: each sublist is already in ascending order
     *
     * @param a     reference to an array of integers to be sorted
     * @param first starting index of range of values to be sorted
     * @param mid   midpoint index of range of values to be sorted
     * @param last  last index of range of values to be sorted
     */
    private void merge(ArrayList<Comparable> a, int first, int mid, int last) {
        ArrayList<Comparable> temp = new ArrayList<Comparable>(a.size());

        int i = first;
        int j = mid;

        while (i < mid && j <= last) {
            if (a.get(i).compareTo(a.get(j)) > 0) {
                temp.add(a.get(j));
                j++;
            } else {
                temp.add(a.get(i));
                i++;
            }
        }
        while (i < mid) {
            temp.add(a.get(i));
            i++;
        }
        while (j <= last) {
            temp.add(a.get(j));
            j++;
        }
        for (int x = first; x <= last; x++) {
            a.set(x, temp.get(x - first));
        }
    }

}