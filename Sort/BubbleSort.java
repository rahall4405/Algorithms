package rahall.example.com.bubblesort;

import java.util.ArrayList;

/**
 * Created by rahall4405 on 2/11/17.
 */

public class BubbleSort {
    private ArrayList<Integer> intArray;
    private long sortTime =0;


    public BubbleSort(ArrayList<Integer> intArray) {
        this.intArray = intArray;
    }

    public ArrayList<Integer> sortInteger() {
        boolean inOrder = false;
        long startTime = System.currentTimeMillis();
        do {
            inOrder = true;
            for (int i = 0; i< intArray.size()-2; i++) {
                // sort Ascending
                if (intArray.get(i) > intArray.get(i+1)) {
                    inOrder = false;
                    int tempInt = intArray.get(i);
                    intArray.set(i,intArray.get(i+1));
                    intArray.set(i+1,tempInt);
                }
            }

        } while (inOrder == false);
        sortTime = (long) System.currentTimeMillis() - startTime;
        return intArray;
    }

    public long getSortTime() {
        return sortTime;
    }
}
