package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-tek-sayi-toplam

public class TillTheOddNumber {
    public static void main(String[] args) {
        int num = 0;

        int total = 0;
        int validNumCount = 0;

        var inp = new Scanner(System.in);
        
        while (true){
            System.out.print("Enter the number : ");
            num = inp.nextInt();

            if(num % 2 == 0){
                if(num % 4 == 0){
                    total += num;
                    validNumCount++;
                }
            } else
                 break; 
        }
        inp.close();

        //If there is at least 1 valid number
        if(validNumCount!=0){
            System.out.println("The average result is : "+(total/validNumCount));
        } else {
            System.out.println("The number you entered is not valid for calculation");
        }
    }
}
