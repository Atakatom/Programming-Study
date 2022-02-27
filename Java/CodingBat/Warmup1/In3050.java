// question link https://codingbat.com/prob/p132134

public class In3050 {
    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    static boolean in3050(int a, int b) {
        if (30 <= a && a <= 40 && 30 <= b && b <= 40) {
            return true;
        }
        if (40 <= a && a <= 50 && 40 <= b == b <= 50) {
            return true;
        }
        return false;
    }
}
