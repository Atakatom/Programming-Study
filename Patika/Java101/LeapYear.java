package Java101;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year; 

        var inp= new Scanner(System.in);

        System.out.print("Enter the year : ");
        year=inp.nextInt();

        inp.close();

        if(year%4==0){
            if(year%100==0 && year%400!=0)
                System.out.println(year+" is not a leap year");
            else
                System.out.println(year+" is a leap year");
        }
        else
            System.out.println(year+" is not a leap year");
    }
}
