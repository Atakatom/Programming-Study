// question link https://codingbat.com/prob/p101887

public class IntMax {
    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    static int intMax(int a, int b, int c) {
        int x = Math.max(a, b);
        return Math.max(x, c);
    }
}
