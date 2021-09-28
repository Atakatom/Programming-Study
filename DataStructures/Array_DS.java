package DataStructures;

import java.util.List;

/*
    Array Reversing Problem
*/
public class Array_DS {
    public static List<Integer> reverseArray(List<Integer> a) {
        for (int i = 0; i < a.size() / 2; i++) {
            int temp = a.get(i);
            a.set(i, a.get(a.size() - (i + 1)));
            a.set(a.size() - (i + 1), temp);
        }
        return a;
    }
}