public class LongestCommonSubsequences {
    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCABA";

        System.out.println("The length of LCS is: " + recursiveSolution(str1, str2, str1.length(), str2.length()));
        System.out.println("Dynamic : " + dynamicSolution(str1, str2));
    }

    public static int recursiveSolution(String X, String Y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return 1 + recursiveSolution(X, Y, m - 1, n - 1);
        }
        return Math.max(recursiveSolution(X, Y, m - 1, n), recursiveSolution(X, Y, m, n - 1));
    }

    public static int dynamicSolution(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] T = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                } else {
                    T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }
        return T[m][n];
    }
}
