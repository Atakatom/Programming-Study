// question link https://codingbat.com/prob/p177372

public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }

    static int max1020(int a, int b) {
        if (10 <= a && a <= 20 && 10 <= b && b <= 20) {
            return Math.max(a, b);
        }
        if (10 <= a && a <= 20) {
            return a;
        }
        if (10 <= b && b <= 20) {
            return b;
        }
        return 0;
    }

}
