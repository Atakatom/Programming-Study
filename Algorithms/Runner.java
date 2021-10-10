package Algorithms;

public class Runner {
    public static void main(String[] args) {
        int[] i = { 3, 4, 7, 5, 6, 2, 1 };
        InsertionSort_Part2.insertionSort(i);
        for (int a : i) {
            System.out.println(a);
        }
    }
}
