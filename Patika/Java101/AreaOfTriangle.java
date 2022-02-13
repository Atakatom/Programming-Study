package Java101;

import java.util.Scanner;

//practice for https://app.patika.dev/moduller/java101/pratik-hipotenus-bulma

public class AreaOfTriangle {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("Value of length a: ");
        double a = scan.nextDouble();
        System.out.print("Value of length b: ");
        double b = scan.nextDouble();
        System.out.print("Value of length c: ");
        double c = scan.nextDouble();

        scan.close();

        double u = (a+b+c)/2;

        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.printf("Area of the triangle is: %.1f\n",area);
    }
}
