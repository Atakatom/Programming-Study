package Java101;

import java.util.Arrays;
import java.util.Scanner;

// hw for https://app.patika.dev/moduller/java101/odev-array-order

public class ArraySorter {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        
        System.out.print("Enter the length of the array : ");
        int length = inp.nextInt();

        var arr = new int[length];

        for(int i = 0; i < length; i++){
            System.out.print("Enter the element no"+(i+1)+" : ");
            arr[i] = inp.nextInt();
        }

        inp.close();
        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
