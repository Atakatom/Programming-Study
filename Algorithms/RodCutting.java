public class RodCutting {
    /*
     * We are given an array price[], where the rod length i has a value price[i-1].
     * The idea is simple, one by one,
     * partition the given rod of length n into two parts; i and n-i. Recur for the
     * rod of length n-i but don't divide the rod of length i any further.
     * Finally, take the maximum of all values. This yields the following recursive
     * 
     * relation: rodcut(n) = max{price[i-1] + rodcut(n-i)} where 1<=i<=n
     */
    public static void main(String[] args) {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };

        // rod length
        int n = 4;

        System.out.println("Profit is " + recursiveSolution(n, price, 0));
        System.out.println(dynamicSolution(price, n));
    }

    static int recursiveSolution(int rodLength, int[] price, int total) {
        if (rodLength == 0) {
            return total;
        }
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < rodLength; i++) {
            maxNum = Integer.max(maxNum, recursiveSolution(rodLength - i - 1, price, total + price[i]));
        }
        return maxNum;
    }

    static int dynamicSolution(int[] price, int n) {
        int[] T = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                T[i] = Integer.max(T[i], price[j - 1] + T[i - j]);
            }
        }
        return T[n];
    }
}
