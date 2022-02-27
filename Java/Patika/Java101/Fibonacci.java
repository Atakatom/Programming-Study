package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-fibo

public class Fibonacci {

    public static void main(String[] args) {
        int num; 

        var inp= new Scanner(System.in);

        System.out.print("Enter the number of element in Fibonacci Series : ");
        num=inp.nextInt();

        inp.close();

        var fibonacci = new int[num+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i <= num; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println("The value of that element is : "+fibonacci[num]);
    }
}