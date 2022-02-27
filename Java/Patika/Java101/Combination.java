package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-faktoriyel

public class Combination {
    public static void main(String[] args) {
        double n,r;

        var inp = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        n = inp.nextDouble();

        System.out.println("Enter the value of r : ");
        r = inp.nextDouble();

        inp.close();

        double result = factorial(n) / (factorial(r) * factorial(n-r));

        System.out.println(result);
    }


    //A little bit of dynamic programming :)
    static double factorial(double n){
        var arr = new int[(int)n];

        arr[0] = 1;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] * arr[i-1];
        }

        return arr[arr.length-1];
    }
}
