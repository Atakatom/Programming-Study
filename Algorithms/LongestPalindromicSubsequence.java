import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s1 = "ABBDCACB";
        System.out.println(recursiveSolution(s1, 0, s1.length() - 1));
        HashMap<String, Integer> lookup = new HashMap<>();
        System.out.println(dynamicMapSolution(s1, 0, s1.length() - 1, lookup));
    }

    public static int recursiveSolution(String str, int i, int j) {
        if (i == j) {
            return 1;
        }
        if (i > j) {
            return 0;
        }
        if (str.charAt(i) == str.charAt(j)) {
            return 2 + recursiveSolution(str, i + 1, j - 1);
        }
        return Integer.max(recursiveSolution(str, i + 1, j), recursiveSolution(str, i, j - 1));

    }

    public static int dynamicMapSolution(String str, int i, int j, Map<String, Integer> lookup) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }
        String key = i + "|" + j;
        if (!lookup.containsKey(key)) {
            if (str.charAt(i) == str.charAt(j)) {
                lookup.put(key, dynamicMapSolution(str, i + 1, j - 1, lookup) + 2);
            } else {
                lookup.put(key, Integer.max(dynamicMapSolution(str, i + 1, j, lookup),
                        dynamicMapSolution(str, i, j - 1, lookup)));
            }
        }
        return lookup.get(key);
    }

}
