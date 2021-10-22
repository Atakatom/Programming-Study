
import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;
        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;
    }
}

/*
 * QUESTION EXPLANATION
 * 
 * In this challenge, you are required to calculate and print the sum of the
 * elements in an array, keeping in mind that some of those integers may be
 * quite large.
 * 
 * Function Description
 * 
 * Complete the aVeryBigSum function in the editor below. It must return the sum
 * of all array elements.
 * 
 * Sample Input
 * 
 * 5 1000000001 1000000002 1000000003 1000000004 1000000005
 * 
 * Output
 * 
 * 5000000015
 * 
 */