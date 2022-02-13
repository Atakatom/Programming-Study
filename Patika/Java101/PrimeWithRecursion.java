package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-recursive-prime

public class PrimeWithRecursion {

    public static void main(String[] args) {
        int num; 

        var inp= new Scanner(System.in);

        System.out.print("Enter the number : ");
        num=inp.nextInt();

        inp.close();

        System.out.println(num + " is " + (isPrime(num, 2) ? "prime" : "not prime"));
    }

    private static boolean isPrime(int num, int divider) {
        if(divider < num){
            if(num % divider == 0)
                return false; 
            return isPrime(num, ++divider);
        }
        return true;
    }
}