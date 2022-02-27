package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-sayi-siralama

public class NumberSorter {
    public static void main(String[] args) {
        int a, b, c;

        var inp = new Scanner(System.in);

        System.out.print("1st number : ");
        a = inp.nextInt();

        System.out.print("2nd number : ");
        b = inp.nextInt();

        System.out.print("3rd number : ");
        c = inp.nextInt();

        inp.close();

        if (a < b && a < c) {
            if (c < b) {
                System.out.println("a < c < b");
            } else {
                System.out.println("a < b < c");
            }
        } else if (b < a && b < c) {
            if (c < a) {
                System.out.println("b < c < a");
            } else {
                System.out.println("b < a < c");
            }
        }
        if (c < a && c < b) {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}
