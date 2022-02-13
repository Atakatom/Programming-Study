package Java101;

import java.util.Scanner;

public class GcdAndLcdCalculator {
    public static void main(String[] args) {
        int num1, num2;
        int gcd=1, lcd=1;

        var inp=new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        num1=inp.nextInt();
        System.out.print("Enter the 2nd number : ");
        num2=inp.nextInt();

        inp.close();

        int a = Math.min(num1, num2);

        while (a>=1){
            if (num1%a==0 && num2%a==0){
                gcd=a;
                break;
            }
            a--;
        }
        System.out.println("GCD(Ebob) value : "+gcd);

        a=1;
        while (a<=(num1*num2)){
            if (a%num1==0 && a%num2==0){
                lcd=a;
                break;
            }
            a++;

        }
        System.out.println("LCD(Ebob) value: "+lcd);





    }
}

