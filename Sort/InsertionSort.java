package rahall.example.com.bubblesort;

import java.util.ArrayList;

/**
 * Created by rahall4405 on 2/14/17.
 */

public class InsertionSort {
    private ArrayList<Integer> intArray;
    private long sortTime =0;

    public InsertionSort(ArrayList<Integer> intArray) {
        this.intArray = intArray;

    }

    public ArrayList<Integer> sortInteger() {
        boolean inOrder = false;
        long startTime = System.currentTimeMillis();
        int sortPosition = 0;
        do {
            for (int i=sortPosition; i>= 0; i--) {
                if (intArray.get(i) > intArray.get(i+1)) {
                    int tempInt = intArray.get(i);
                    intArray.set(i,intArray.get(i+1));
                    intArray.set(i+1,tempInt);
                }

                if(sortPosition == intArray.size()-2) {

                    inOrder = true;
                }
            }
            sortPosition++;
        } while (inOrder == false);
        sortTime = (long) System.currentTimeMillis() - startTime;
        return intArray;

    }
    public long getSortTime() {
        return sortTime;
    }

}
