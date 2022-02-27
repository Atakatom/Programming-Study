package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-vucut-kitle-hesaplama

public class BodyMassIndex {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double height = scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double weight = scan.nextDouble();

        scan.close();

        double bmi = weight / (height * height);
        System.out.printf("Vücut Kitle İndeksiniz : %f\n",bmi);
    }
}
