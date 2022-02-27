package Java101;

//hw for https://app.patika.dev/moduller/java101/odev-manav-kasa

import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("How many kgs of Pear : ");
        double pear = 2.14 * scan.nextDouble();
        
        System.out.print("How many kgs of Apple : ");
        double apple = 3.67 * scan.nextDouble();

        System.out.print("How many kgs of Tomato : ");
        double tomato = 1.11 * scan.nextDouble();

        System.out.print("How many kgs of Banana : ");
        double banana = 0.95 * scan.nextDouble();

        System.out.print("How many kgs of Eggplant : ");
        double eggplant = 5.00 * scan.nextDouble();

        scan.close();

        double totalCost = pear + apple + tomato + banana + eggplant;
        System.out.printf("How many kgs of Pear : %.2f\n",totalCost);
    }
}
