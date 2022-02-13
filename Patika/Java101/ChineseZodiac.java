package Java101;

import java.util.Scanner;

public class ChineseZodiac{
    public static void main(String[] args) {
        int birthYear, zodiacNum;

        var inp = new Scanner(System.in);

        System.out.print("Enter the birth year : ");
        birthYear = inp.nextInt();

        inp.close();

        zodiacNum = birthYear % 12;

        switch (zodiacNum){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("Bull");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Bunny");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            default:
                System.out.println("Sheep");
                break;
        }
    }
}