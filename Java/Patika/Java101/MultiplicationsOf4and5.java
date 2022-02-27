package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-two-power

public class MultiplicationsOf4and5 {
    public static void main(String[] args) {
        int num;

        var inp = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        num = inp.nextInt();

        inp.close();

        System.out.println("List of the power of 4");
        int powOfFour = 4;
        while(powOfFour < num){
            System.out.println(powOfFour);
            powOfFour *= 4;
        }

        System.out.println("\nList of the power of 5");
        int powOfFive = 5;
        while(powOfFive < num){
            System.out.println(powOfFive);
            powOfFive *= 5;
        }
    }
}
