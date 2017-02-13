package rahall.example.com.bubblesort;

import java.util.ArrayList;

/**
 * Created by rahall4405 on 2/12/17.
 */

public class SelectionSort {
    private ArrayList<Integer> intArray;
    private long sortTime = 0;

    public SelectionSort(ArrayList<Integer> intArray) {
        this.intArray = intArray;
    }

    public ArrayList<Integer> sortInteger() {
        int sortedIndex = 0;
        boolean inOrder = false;
        int smallestNumberIndex = 0;
        long startTime = System.currentTimeMillis();
        do {
            for (int i = 0 + sortedIndex; i < intArray.size(); i++) {
                if (i == 0) {
                    smallestNumberIndex = sortedIndex;

                } else if (i == intArray.size() - 1) {
                    if (intArray.get(i) < intArray.get(smallestNumberIndex)) {
                        smallestNumberIndex = i;
                    }
                    int tempInt = intArray.get(smallestNumberIndex);
                    intArray.set(smallestNumberIndex, intArray.get(sortedIndex));
                    intArray.set(sortedIndex, tempInt);
                    sortedIndex++;
                } else {
                    if (intArray.get(i) < intArray.get(smallestNumberIndex)) {
                        smallestNumberIndex = i;
                    }
                }

            }
        } while (sortedIndex < intArray.size() - 1);
        sortTime = (long) System.currentTimeMillis() - startTime;
        return intArray;

    }
    public long getSortTime() {
        return sortTime;
    }

}
