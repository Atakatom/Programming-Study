package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-cift-sayi-toplam

public class FullDivider3and4 {
    public static void main(String[] args) {
        int num;

        var inp = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        num = inp.nextInt();
        inp.close();

        int total = 0;
        int validNumCount = 0;

        //12 is the first number that is full divided to both 3 and 4
        for(int i = 12; i < num; i++){
            if(i % 3 == 0 && i % 4 == 0){
                total += i;
                validNumCount++;
            }
        }

        //If there is at least 1 valid number
        if(validNumCount!=0){
            System.out.println("The average of the amount of numbers that can be divided to both 3 and 4 is : "+(total/validNumCount));
        } else {
            System.out.println("The number you entered is not valid for calculation");
        }
    }
}
