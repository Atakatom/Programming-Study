package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array2D_DS {
    public static int hourglassSum(List<List<Integer>> arr) {
        ArrayList<Integer> totalSum = new ArrayList<>();
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(0).size() - 2; j++) {
                totalSum.add(
                        arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
                                + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
            }
        }
        return Collections.max(totalSum);
    }
}

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19