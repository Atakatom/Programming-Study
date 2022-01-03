public class KnapsackMin20150807041 {
    public static void main(String[] args) {
        int[] weights = { 1, 4, 5 };
        int[] n = { 100, 270, 52 };
        long[][] actualRuntimesNano = new long[2][3];
        long startTimeNano;
        int[][] answers = new int[2][3];
        for (int i = 0; i < 3; i++) {
            startTimeNano = System.nanoTime();
            answers[0][i] = dynamicSolution(n[i], weights);
            actualRuntimesNano[0][i] = System.nanoTime() - startTimeNano;
            startTimeNano = System.nanoTime();
            answers[1][i] = recursiveSolution(n[i], weights, 0);
            actualRuntimesNano[1][i] = System.nanoTime() - startTimeNano;
        }
        for (int i = 0; i < actualRuntimesNano[0].length; i++) {
            System.out.println("\n--------------------------------------\n");
            System.out.println("Bag Capacity : " + n[i]);
            System.out.println("Runtimes in nanoseconds");
            System.out.println("Dynamic : " + actualRuntimesNano[0][i] + " nanoseconds - answer : " + answers[0][i]);
            System.out.println("Recursion : " + actualRuntimesNano[1][i] + " nanoseconds - answer : " + answers[1][i]);
        }
    }

    /**
     * My function creates a solution matrix to save all possible outcomes
     * Logic is same as the 0/1 knapsack problem but rather than trying to make the
     * most valuable bag we are now trying to have the least amount of items
     * 
     * @param capacity is the n value of thief's bag capacity
     * @param weights  contains each items weight in it
     * @return left bottom value of the solution matrix
     */
    static int dynamicSolution(int capacity, int[] weights) {
        int[][] totalSolutions = new int[weights.length][capacity + 1];
        for (int i = 0; i < totalSolutions.length; i++) {
            for (int j = 1; j < totalSolutions[0].length; j++) {
                if (j < weights[i]) {
                    if (i == 0)
                        totalSolutions[i][j] = 0;
                    else
                        totalSolutions[i][j] = totalSolutions[i - 1][j];
                } else {
                    int column = (j - weights[i]);
                    int tempSol = 1 + totalSolutions[i][column];
                    if (i > 0 && (tempSol > totalSolutions[i - 1][j])) {
                        totalSolutions[i][j] = totalSolutions[i - 1][j];
                    } else {
                        totalSolutions[i][j] = tempSol;
                    }
                }
            }
        }
        return totalSolutions[weights.length - 1][capacity];
    }

    static int recursiveSolution(int capacity, int[] weights, int total) {
        if (capacity == 0)
            return total;
        if (capacity < 0)
            return Integer.MAX_VALUE;
        total++;
        int minOutcome = Integer.MAX_VALUE;
        for (int i = 0; i < weights.length; i++) {
            minOutcome = Math.min(minOutcome, recursiveSolution(capacity - weights[i], weights, total));
        }
        return minOutcome;
    }
}
