package Java101;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        final int startingPrice = 10;
        var scan = new Scanner(System.in);

        System.out.print("Please enter how far would you like to go(km): ");
        int length = scan.nextInt();

        scan.close();

        double totalPrice = (length < 5) ? 20 : (startingPrice+(2.20)*length);

        System.out.printf("The total price of your destination is : %.1f tl\n",totalPrice);
    }
}
