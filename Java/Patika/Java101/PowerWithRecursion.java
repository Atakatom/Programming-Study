package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-recursive-power

public class PowerWithRecursion {

    public static void main(String[] args) {
        int base, power; 

        var inp= new Scanner(System.in);

        System.out.print("Enter the base : ");
        base=inp.nextInt();

        System.out.print("Enter the power : ");
        power=inp.nextInt();

        inp.close();
        
        System.out.print("The result is : ");
        if(power == 0)
            System.out.println(1);
        else 
            System.out.println(recursivePower(base,power));
    }

    private static int recursivePower(int base, int power) {
        if(power == 1) return base;
        return base * recursivePower(base,--power);
    }
}
