package Java101;

import java.util.Scanner;

//hw for https://app.patika.dev/moduller/java101/odev-min-max

public class MinAndMaxValue {
    public static void main(String[] args) {
        int num, loop;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        var inp=new Scanner(System.in);

        System.out.print("How many values will you enter : ");
        loop = inp.nextInt();

        for(int i = 1; i <= loop; i++){
            System.out.print("Enter the number"+i+" : ");
            num = inp.nextInt();
            if(minVal > num)
                minVal = num;
            if(maxVal < num)
                maxVal = num;
        }

        inp.close();

        System.out.println("The minimum value you have entered is : "+minVal);
        System.out.println("The maximum value you have entered is : "+maxVal);
    }
}