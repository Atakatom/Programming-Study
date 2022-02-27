public class MaximumProductRodCutting {
    public static void main(String[] args) {
        System.out.println(recursiveSolution(15));
        System.out.println(dynamicSolution(6));
    }

    static int recursiveSolution(int n) {
        if (n <= 1) {
            return n;
        }
        int maxValue = n;
        for (int i = 1; i <= n; i++) {
            maxValue = Integer.max(maxValue, i * recursiveSolution(n - i));

        }
        return maxValue;
    }

    static int dynamicSolution(int n) {
        int[] T = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (T[i - j] == 0)
                    T[i - j]++;
                T[i] = Integer.max(T[i], j * T[i - j]);
            }
        }
        return T[n];
    }
}
