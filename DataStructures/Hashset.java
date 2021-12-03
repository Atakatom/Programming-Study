
import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void Scan() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        findUniquePairs(pair_left, pair_right, t);
        s.close();
    }

    public static void findUniquePairs(String[] pair_left, String[] pair_right, int t) {
        HashSet<String> pairs = new HashSet<String>();
        for (int j = 0; j < t; j++) {
            pairs.add(pair_left[j] + " " + pair_right[j]);
            System.out.println(pairs.size());
        }
    }
    /*
     * Sample Input
     * 
     * 5 john tom john mary john tom mary anna mary anna
     * 
     * Sample Output
     * 
     * 1 2 2 3 3
     */

}
