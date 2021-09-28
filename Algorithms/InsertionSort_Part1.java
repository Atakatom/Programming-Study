package Algorithms;

import java.util.List;

public class InsertionSort_Part1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        int x = arr.get(n-- - 1);
        while (n > 0 && arr.get(n - 1) > x) {
            arr.set(n, arr.get(n - 1));
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            n--;
        }
        arr.set(n, x);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
