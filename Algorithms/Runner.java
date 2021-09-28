package Algorithms;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Integer[] i = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
        List<Integer> l1 = Arrays.asList(i);
        InsertionSort_Part1.insertionSort1(10, l1);
    }
}
