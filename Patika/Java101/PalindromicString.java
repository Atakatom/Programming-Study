package Java101;

import java.util.Scanner;

//practise for https://app.patika.dev/moduller/java101/pratik-palindrom-string

public class PalindromicString {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = inp.nextLine().trim();

        inp.close();
        System.out.println( word + (isPalindrome(word) ?" is palindrome" : " is not palindrome"));
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

}