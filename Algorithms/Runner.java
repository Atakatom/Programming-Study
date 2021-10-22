
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.nextLine();
        int loop = input.nextInt();
        input.nextLine();
        for (int j = 0; j < loop; j++) {
            String s = input.nextLine().trim();
            int index = input.nextInt();
            int[] arr2 = arr;
            switch (s) {
                case "Insert":
                    arr2 = new int[arr.length + 1];
                    for (int i = 0; i < index; i++) {
                        arr2[i] = arr[i];
                    }
                    arr2[index] = input.nextInt();
                    for (int k = index + 1; k < arr2.length; k++) {
                        arr2[k] = arr[k - 1];
                    }
                    break;
                case "Delete":
                    arr2 = new int[arr.length - 1];
                    for (int i = 0; i < index; i++) {
                        arr2[i] = arr[i];
                    }
                    for (int k = index + 1; k < arr.length; k++) {
                        arr2[k - 1] = arr[k];
                    }
                    break;
            }
            if (input.hasNext())
                input.nextLine();
            for (int t : arr2) {
                System.out.print(t + " ");
            }
        }
        input.close();
    }
}
