
import java.util.*;

public class ArrayListQ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer[]> arr = new ArrayList<>();
        int loop = input.nextInt();
        for (int j = 0; j < loop; j++) {
            arr.add(new Integer[input.nextInt()]);
            for (int i = 0; i < arr.get(j).length; i++) {
                arr.get(j)[i] = input.nextInt();
            }
        }
        loop = input.nextInt();
        for (int k = 0; k < loop; k++) {
            Integer[] li = arr.get(input.nextInt() - 1);
            int index = input.nextInt();
            if (index > li.length) {
                System.out.println("ERROR!");
            } else {
                System.out.println(li[index - 1]);
            }
        }
        input.close();
    }
}