package Java101;

import java.util.Scanner;

public class FlightTicketCost {
    static public void main(String[] args) {
        double distance, mainPrice;
        int age, choice;

        var inp = new Scanner(System.in);

        System.out.print("The distance of your flight in KMs : ");
        distance = inp.nextInt();

        mainPrice = distance * 0.1;

        System.out.print("Age of the passenger : ");
        age = inp.nextInt();

        System.out.println("What is the flight direction?\n" +
                "1- One way \n" +
                "2- Returning");

        System.out.print("Please enter your choice : ");
        choice = inp.nextInt();

        if (age < 0 || distance < 0 || choice > 2 || choice < 1)
            System.out.println("You have entered invalid data");
        else {
            if (age < 12) {
                mainPrice = mainPrice * 0.5;
            } else if (12 <= age && 24 >= age) {
                mainPrice = mainPrice * 0.9;
            } else if (age > 65) {
                mainPrice = mainPrice * 0.7;
            }

            if (choice == 2) {
                mainPrice *= (2 * 0.8);
            }

            System.out.println("Total price: " + mainPrice + "USD");
        }
    }
}
