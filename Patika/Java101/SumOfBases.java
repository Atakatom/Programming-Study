package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-armstrong-1

public class SumOfBases{
    public static void main(String[] args) {
        int num, result = 0;

        var inp = new Scanner(System.in);

        System.out.print("Enter the number : ");
        num = inp.nextInt();

        inp.close();

        while(num % 10 != 0){
            result += num%10;
            num = num/10;
        }

        System.out.println("The result is : "+result);

    }
}
