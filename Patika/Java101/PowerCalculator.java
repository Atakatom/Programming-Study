package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-faktoriyel

public class PowerCalculator {
    public static void main(String[] args) {
        int n, r ,result;

        var inp = new Scanner(System.in);

        System.out.print("Enter the value of base : ");
        n = inp.nextInt();

        System.out.print("Enter the value of power : ");
        r = inp.nextInt();

        inp.close();

        if (r > 0) {
            result = 1;
            while (r-- > 0) {
                result *= n;
            }
            System.out.println(result);
        } else {
            System.out.println(1);
        }
    }
}
