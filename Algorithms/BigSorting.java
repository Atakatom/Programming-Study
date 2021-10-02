package Algorithms;

import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        for (int i = 1; i < unsorted.size(); i++) {
            int tempI = i;
            while (i > 0) {
                double a = Double.parseDouble(unsorted.get(i));
                double b = Double.parseDouble(unsorted.get(i - 1));
                if (b > a) {
                    String tempV = unsorted.get(i);
                    unsorted.set(i, unsorted.get(i - 1));
                    unsorted.set((i - 1), tempV);
                }

                i--;
            }
            i = tempI;
        }
        return unsorted;
    }
}

/*
 * IT WORKS AS LONG AS THE INPUT IS NOT OUT OF RANGE OF DOUBLE
 * 
 * Description
 * 
 * Complete the bigSorting function in the editor below.
 * 
 * bigSorting has the following parameter(s):
 * 
 * string unsorted[n]: an unsorted array of integers as strings
 * 
 * Returns
 * 
 * string[n]: the array sorted in numerical order
 * 
 * Sample Input
 * 
 * 6 31415926535897932384626433832795 1 3 10 3 5
 * 
 * Sample Output
 * 
 * 1 3 3 5 10 31415926535897932384626433832795
 */