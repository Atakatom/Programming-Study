package Java101;

import java.util.Scanner;

public class AreaOfCirleSlice {
    public static void main(String[] args) {
        final double pi = 3.14;
        var scan = new Scanner(System.in);

        System.out.print("Enter the value of radius: ");
        double r = scan.nextDouble();

        System.out.printf("Enter the value of angle: ");
        double a = scan.nextDouble();

        scan.close();

        double sliceArea = (pi * (r*r) * a)/360;
        System.out.printf("The area of the circle slice is : %.1f\n",sliceArea);
    }
}
