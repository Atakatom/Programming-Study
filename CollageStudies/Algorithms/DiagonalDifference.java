
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int rIndex = 0;
        int lIndex = size - 1;
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += arr.get(i).get(rIndex++);
            result -= arr.get(i).get(lIndex--);
        }
        return Math.abs(result);
    }
}

/*
 * Function description
 * 
 * Complete the function in the editor below.
 * 
 * diagonalDifference takes the following parameter:
 * 
 * int arr[n][m]: an array of integers
 * 
 * Return
 * 
 * int: the absolute diagonal difference
 * 
 * Output Format
 * 
 * Return the absolute difference between the sums of the matrix's two diagonals
 * as a single integer.
 * 
 * Sample Input
 * 
 * 3 11 2 4 4 5 6 10 8 -12
 * 
 * Sample Output
 * 
 * 15
 * 
 * Explanation
 * 
 * The primary diagonal is:
 * 
 * 11 5 -12
 * 
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * 
 * The secondary diagonal is:
 * 
 * 4 5 10
 * 
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * 
 * Difference: |4 - 19| = 15
 * 
 */
