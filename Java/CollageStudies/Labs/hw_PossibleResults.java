import java.util.HashSet;
import java.util.Scanner;

public class hw_PossibleResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        // System.out.print("Please enter the first sentence : ");
        // String first = input.next().trim();
        // System.out.println(first + " + ?");
        // System.out.print("Please enter the second sentence : ");
        // String second = input.next().trim();
        // System.out.println(first + " + " + second + " = ?");
        // System.out.print("Please enter the result sentence : ");
        // String result = input.next().trim();
        // System.out.println("Here is your equation : ");
        // System.out.println(first + " + " + second + " = " + result);
        // String all = first + second + result;
        String all = "atakanyontar";
        input.close();
        HashSet<Character> hset1 = new HashSet<>();
        for (i = 0; i < all.length(); i++)
            hset1.add(all.charAt(i));

        HashSet<Character> hset2 = new HashSet<>();
        SolvePuzzle(hset1.size(), hset2, hset1);

    }

    public static void SolvePuzzle(int k, HashSet<Character> S, HashSet<Character> U) {
        for (Character e : U) {
            U.remove(e);
            S.add(e);
            if (k == 1) {
                // check();
                // if check true the disp solution
                System.out.println(S.toString());
                System.out.println(U.toString());
            } else {
                System.out.println(S.toString());
                System.out.println(U.toString());
                System.out.println(k);
                SolvePuzzle(k - 1, S, U);
            }
            S.remove(e);
            U.add(e);
        }
    }

    public static String subtractTheSame(String sentence, int index) {
        if (index == sentence.length() - 1)
            return sentence;
        char c = sentence.charAt(index);
        int j = sentence.lastIndexOf(c);
        if (index != j)
            sentence = sentence.substring(0, j) + sentence.substring(j + 1);
        else
            index++;
        return subtractTheSame(sentence, index);

    }

}
/*
 * cbb + ba = abc first + second = result;
 *
 */