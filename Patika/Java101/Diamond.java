package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-yildiz-ucgen

public class Diamond {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = inp.nextInt();

        inp.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-2; i >= 0; i--) {
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