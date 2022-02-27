public class CoinChange {
    public static void main(String[] args) {
        // coins of given denominations
        int[] S = { 1, 3, 5, 7 };

        // total change required
        int target = 18;
        System.out.println(recursiveSolution(S, target));
        System.out.println(dynamicSolution(S, target));

    }

    static int recursiveSolution(int[] S, int target) {
        if (target == 0)
            return 0;
        if (target < 0)
            return Integer.MAX_VALUE;
        int coins = Integer.MAX_VALUE;
        for (int c : S) {
            int result = recursiveSolution(S, target - c);
            if (result != Integer.MAX_VALUE) {
                coins = Integer.min(coins, result + 1);
            }
        }
        return coins;
    }

    static int dynamicSolution(int[] S, int target) {
        int[] T = new int[target + 1];

        for (int i = 1; i <= target; i++) {

            T[i] = Integer.MAX_VALUE;
            int result = Integer.MAX_VALUE;

            for (int c : S) {

                if (i - c >= 0) {
                    result = T[i - c];
                }
                if (result != Integer.MAX_VALUE) {
                    T[i] = Integer.min(T[i], result + 1);
                }
            }
        }
        return T[target];
    }
}
