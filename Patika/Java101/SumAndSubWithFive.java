package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-recursive-pattern

public class SumAndSubWithFive {
    public static void main(String[] args) {
        int num;

        var inp = new Scanner(System.in);

        System.out.print("Enter the number : ");
        num = inp.nextInt();

        inp.close();

        int lowest = printTillMinus(num);
        printTillNum(num, lowest+5);
    }

    private static void printTillNum(int num, int start) {
        System.out.print(start + " ");
        start += 5;
        if(start <= num){
            printTillNum(num, start);
        }
    }

    private static int printTillMinus(int num) {
        System.out.print(num+" ");
        if(num <= 0){
            return num;
        }
        return printTillMinus(num-5);
    }
}