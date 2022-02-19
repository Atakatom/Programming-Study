// question link https://codingbat.com/prob/p165701

public class LoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    static boolean loneTeen(int a, int b) {
        return ((13 <= a && a <= 19) && (b > 19 || b < 13)) || ((13 <= b && b <= 19) && (a > 19 || a < 13));
    }
}
