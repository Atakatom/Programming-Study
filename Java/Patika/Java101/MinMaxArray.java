package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-min-max

public class MinMaxArray {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inp.nextInt();

        inp.close();
        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < num) {
                if (i > min){
                    min = i;
                }
            }
            if (i > num) {
                if (i < max) {
                    max = i;
                }
            }
        }

        System.out.println("Minimum Yakin Değer " + min);
        System.out.println("Maximum Yakin Değer " + max);
    }
}
