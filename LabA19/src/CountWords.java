import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author aaditya
 * last name: Bhoota
 * first name: Aaditya
 * Student ID: 12110538
 * period: 3
 */
public class CountWords {
    // Your code goes here
    private ArrayList<Word> a = new ArrayList<Word>();
    private String fileName;

    /**
     *
     * @param fName - File name
     */
    public CountWords(String fName) {
        fileName = fName;
        System.out.println("File: " + fileName);
        loadFile(fileName);
    }

    /**
     *
     * @param fName - file name
     */
    private void loadFile(String fName) {
        try {
            Scanner sc = new Scanner(new File(fName));
            a.add(new Word(sc.next().toLowerCase()));
            while (sc.hasNext()) {
                String word = sc.next();
                while (word.length() >= 1 && (word.toLowerCase().charAt(word.length() - 1) < 'a' ||
                        word.toLowerCase().charAt(word.length() - 1) > 'z') && (word.toLowerCase().charAt(word.length() - 1) < '0' ||
                        word.toLowerCase().charAt(word.length() - 1) > '9')) {
                    word = word.substring(0, word.length() - 1);
                }
                while (word.length() >= 1 && (word.toLowerCase().charAt(0) < 'a' ||
                        word.toLowerCase().charAt(0) > 'z') && (word.toLowerCase().charAt(0) < '0' ||
                        word.toLowerCase().charAt(0) > '9')) {
                    word = word.substring(1);
                }
                boolean onlyWhiteSpace = true;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) != ' ') {
                        onlyWhiteSpace = false;
                    }
                }
                if (!onlyWhiteSpace) {
                    Word w = new Word(word);
                    int index = bSearch(w);
                    if (index >= 0) {
                        a.get(index).incrementCount();
                    } else {
                        a.add(w);
                    }
                    sort();
                }
            }
        } catch (Exception e) {
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param w - word to search for
     * @return - calls recursive bsearch
     */
    private int bSearch(Word w) {
        return bSearch(w, 0, a.size() - 1);
    }

    /**
     *
     * @param w - word to be searched
     * @param first - first index of word
     * @param last - last index of word
     * @return - index of word in arraylist
     */
    private int bSearch(Word w, int first, int last) {
        int mid = (last + first) / 2;
        if (first > last || mid > a.size()) {
            return -1;
        }
        if (a.get(mid).compareTo(w) == 0) {
            return mid;
        } else if (a.get(mid).compareTo(w) > 0) {
            return bSearch(w, first, mid - 1);
        } else {
            return bSearch(w, mid + 1, last);
        }
    }

    /**
     * to get recursive sort going
     */
    public void sort() {
        mergeSort(a, 0, a.size() - 1);
    }

    /**
     *
     * @param a - array to be sorted
     * @param first - first index of array
     * @param mid - midddle index of array
     * @param last - last index of array
     */
    private void merge(ArrayList<Word> a, int first, int mid, int last) {
        ArrayList<Word> temp1 = new ArrayList<Word>(a.size());
        int i = first;
        int j = mid;
        while (i < mid && j <= last) {
            if (a.get(i).compareTo(a.get(j)) > 0) {
                temp1.add(a.get(j));
                j++;
            } else {
                temp1.add(a.get(i));
                i++;
            }
        }
        while (j <= last) {
            temp1.add(a.get(j));
            j++;
        }
        while (i < mid) {
            temp1.add(a.get(i));
            i++;
        }
        for (int k = first; k <= last; k++) {
            a.set(k, temp1.get(k - first));
        }


    }

    /**
     *
     * @param a - array to be sorted
     * @param first - first index of array
     * @param last - last index of array
     */
    public void mergeSort(ArrayList<Word> a, int first, int last) {
        if (last - first >= 1) {
            int mid = (first + last) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid + 1, last);
        }
    }

    /**
     * prints the stats of the file
     */
    public void printStats() {
        int numUniqueWords = a.size();
        System.out.println("Total number of unique words used in the file: " + numUniqueWords);
        int totalWords = 0;
        for (Word b : a) {
            totalWords += b.getCount();
        }
        System.out.println("Total number of words in file: " + totalWords);
        //find out the top 30 words
        System.out.println("Top 30 words are:");
        ArrayList<Word> copy = new ArrayList<Word>();
        for (Word b : a) {
            copy.add(b);
        }
        int iterNum = 0;
        while (iterNum < 30 && iterNum < a.size()) {
            int numCount = copy.get(0).getCount();
            int index = 0;
            String largeWord = copy.get(0).getWord();
            for (int i = 1; i < copy.size(); i++) {
                if (copy.get(i).getCount() > numCount) {
                    numCount = copy.get(i).getCount();
                    largeWord = copy.get(i).getWord();
                    index = i;
                }
            }
            copy.remove(index);
            System.out.println("" + iterNum + "\t" + numCount + "\t" + largeWord);
            iterNum++;
        }

    }
}