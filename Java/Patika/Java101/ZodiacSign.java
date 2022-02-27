package Java101;

import java.util.Scanner;

public class ZodiacSign {
    static public void main(String[] args) {
        var inp = new Scanner (System.in);

        System.out.print("Enter the month and day you were born (example:11.01, 01.01, 12.06 etc.) : ");

        double date = inp.nextDouble();

        inp.close();


        System.out.print("Your zodiac sign is: ");

        if (date>= 12.22 || date<=01.21) 
            System.out.println("Capricorn");
        else if (date>= 01.22 && date<=02.19)  
            System.out.println("Aquarius ");
        else if (date >= 02.20 && date<=03.20)
             System.out.println("Pisces");
        else if (date >= 03.21 && date<=04.20) 
            System.out.println("Aries");
        else if (date >= 04.21 && date<=05.21) 
            System.out.println("Taurus:");
        else if (date >= 05.22 && date<=06.22) 
            System.out.println("Gemini");
        else if (date >= 06.23 && date<=07.22) 
            System.out.println("Cancer");
        else if (date >= 07.23 && date<=08.22) 
            System.out.println("Leo");
        else if (date >= 08.23 && date<=09.22) 
            System.out.println("Virgo");
        else if (date >= 09.23 && date<=10.22) 
            System.out.println("Libra");
        else if (date >= 10.23 && date<=11.21) 
            System.out.println("Scorpio");
        else 
            System.out.println("Sagittarius");
    }

}