import java.util.List;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int[] n = new int[3];
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0)
                n[0]++;
            else if (arr.get(i) < 0)
                n[1]++;
            else
                n[2]++;
        }
        float ratio;
        for (int j : n) {
            ratio = (float) j / (float) arr.size();
            System.out.printf("%1.6f\n", ratio);
        }

    }

}