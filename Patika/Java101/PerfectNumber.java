package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-mukemmel-sayi

public class PerfectNumber {
    public static void main(String[] args) {
        int num ,result=0;

        var inp = new Scanner(System.in);

        System.out.print("Enter the value of base : ");
        num = inp.nextInt();

        for(int i = 1; i < num; i++){
            if(num%i==0){
                result+=i;
            }
        }

        System.out.print(num);
        System.out.println((result == num) ? " is a perfect number" : " is not a perfect number");

        inp.close();

    }
    
}
