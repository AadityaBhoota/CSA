import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author last name: Bhoota
 * first name: Aaditya
 * student ID: 12110538
 * period 3
 */
public class Store {
    private ArrayList<Item> myStore = new ArrayList<Item>();
    Scanner sc;

    /**
     * @param fName - file name
     */
    public Store(String fName) {
        try {
            sc = new Scanner(new File(fName));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        loadFile();
    }

    /**
     * default constructor
     */
    public Store() {
        loadFile();
    }

    /**
     * Loads file
     */
    private void loadFile() {
        while (sc.hasNextInt()) {
            myStore.add(new Item(sc.nextInt(), sc.nextInt()));
        }
    }

    /**
     * Displays store contents
     */
    public void displayStore() {
        System.out.print(this.toString());
    }

    /**
     * @return s - returns Store as string
     */
    public String toString() {
        String s = String.format("%10s%10s\n\n", "Id", "Inv");
        for (int i = 0; i < myStore.size(); i++) {
            s += String.format("%2d%s\n", i + 1, myStore.get(i));
            if ((i + 1) % 10 == 0) {
                s += "\n";
            }
        }
        return s;
    }

    /**
     * Sorts arrayList
     */
    public void sort() {
        mergeSort(myStore, 0, myStore.size() - 1);
    } //to get recursive sort going

    /**
     * @param a     - arrayList to be sorted
     * @param first - first index where sorting starts
     * @param mid   - middle index of arrayList
     * @param last  - last index of arrayList
     */
    private void merge(ArrayList<Item> a, int first, int mid, int last) {
        ArrayList<Item> temp = new ArrayList<Item>(a.size());

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

    /**
     * @param a     - arrayList to be sorted
     * @param first - first index of arrayList
     * @param last  - last index of arrayList
     */
    public void mergeSort(ArrayList<Item> a, int first, int last) {
        if (last - first >= 1) {
            int mid = (last + first) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid + 1, last);
        }
    }

    /**
     * tests the bsearch
     */
    public void testSearch() {
        int idToFind;
        int invReturn;
        int index;
        Scanner in = new Scanner(System.in);

        System.out.println("Testing search algorithm\n");
        do {
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) --> ");
            idToFind = in.nextInt();
            if (idToFind >= 0) {
                //index = bsearch(new Item(idToFind, 0));
                //recursive version call
                index = bsearch(new Item(idToFind, 0), 0, myStore.size() - 1);
                System.out.print("Id # " + idToFind + ":");
                if (index == -1) {
                    System.out.println(" No such part in stock");
                } else {
                    System.out.println(" Inventory = " + myStore.get(index).getInv());
                }
            }
        } while (idToFind >= 0);
    }

    /**
     * Searches the myStore ArrayList of Item Objects for the specified
     * item object using a iterative binary search algorithm
     *
     * @param idToSearch Item object containing id value being searched for
     * @return index of Item if found, -1 if not found
     */

    private int bsearch(Item idToSearch) {
        int left = 0;
        int right = myStore.size() - 1;
        int mid;
        while (left <= right) {
            mid = (right + left) / 2;
            if (idToSearch.equals(myStore.get(mid))) {
                return mid;
            } else if (idToSearch.compareTo(myStore.get(mid)) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Searches the specified ArrayList of Item Objects for the specified
     * id using a recursive binary search algorithm
     *
     * @param idToSearch Id value being search for
     * @param first      Starting index of search range
     * @param last       Ending index of search range
     * @return index of Item if found, -1 if not found
     */

    private int bsearch(Item idToSearch, int first, int last) {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;
        if (idToSearch.equals(myStore.get(mid))) {
            return mid;
        } else if (idToSearch.compareTo(myStore.get(mid)) > 0) {
            return bsearch(idToSearch, mid + 1, last);
        } else {
            return bsearch(idToSearch, first, mid - 1);
        }
    }
}