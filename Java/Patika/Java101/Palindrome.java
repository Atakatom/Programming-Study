package Java101;

import java.util.Scanner;

// hw for https://app.patika.dev/moduller/java101/pratik-palindrom

public class Palindrome {
    public static void main(String[] args) {
        int num; 

        var inp= new Scanner(System.in);

        System.out.print("Enter the number : ");
        num = inp.nextInt();

        inp.close();

        System.out.print(num + " is ");
        System.out.println(isPalindrome(num) ? "palindrome" : "not palindrome");
    }

    static boolean isPalindrome(int number){
        int temp = number, reverseNumber =  0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        return number == reverseNumber;
    }
    
}
