//question link https://codingbat.com/prob/p154485

public class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(2, 2));
        System.out.println(sumDouble(3, 2));
    }

    static int sumDouble(int a, int b) {
        return (a == b) ? 2 * (a + b) : a + b;
    }
}
