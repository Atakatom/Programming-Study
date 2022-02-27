package Java101;

import java.util.Scanner;

//Practice for https://app.patika.dev/moduller/java101/pratik-kdv-hesaplama

class KDVCalculator{
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("Enter the cost: ");
        double cost = scan.nextInt();
        scan.close();

        double tax = (cost < 1000) ? cost * 0.18 : cost * 0.08;
        cost += tax;

        System.out.printf("The cost with additional tax is :%.1f\n",cost);
    }
}