package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/pratik-etkinlik-onerme

public class ActivityForTemprature {
    public static void main(String[] args) {
        int temp;

        var inp = new Scanner(System.in);

        System.out.print("What is the temprature : ");
        temp = inp.nextInt();

        inp.close();

        //example asks me to do this without if-else so the following codes will be a bit complicated

        int choice = 0;
        choice = (temp < 5) ? 1 : choice;
        choice = (temp < 15 && temp >=5) ? 2 : choice;
        choice = (temp < 25 && temp >=15) ? 3 : choice;
        choice = (temp > 25) ? 4 : choice;
         
        System.out.print("You could ");
        switch(choice){
            case 1:
                System.out.println("go to skiing");
                break;
            case 2:
                System.out.println("satch a movie in theaters");
                break;
            case 3:
                System.out.println("go for a picnic");
                break;
            case 4:
                System.out.println("go for a swimming");
                break;
        }
        
    }
}
