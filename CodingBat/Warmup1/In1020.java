// question link https://codingbat.com/prob/p144535

public class In1020 {
    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
    }

    static boolean in1020(int a, int b) {
        return ((9 < a && a < 21) || (9 < b && b < 21));
    }
}
