package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-harmonic

public class HarmonicSeries {
    public static void main(String[] args) {
        int num;
        double result = 0;

        var inp = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        num = inp.nextInt();
        inp.close();

        for(int i = 1; i < num; i++){
            result += 1/i;
        }

        System.out.println("The result is " +result);
    }
}

