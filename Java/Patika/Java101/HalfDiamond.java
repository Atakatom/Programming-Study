package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-ters-ucgen

public class HalfDiamond {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = inp.nextInt();

        inp.close();
        for (int i = n-1; i >= 0; i--) {
            for (int j = (n - i); j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i + 1); k > 0 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}