// question link https://codingbat.com/prob/p172021

public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    static int close10(int a, int b) {
        if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        } else if (Math.abs(b - 10) > Math.abs(a - 10)) {
            return a;
        }
        return 0;
    }
}
