// question link https://codingbat.com/prob/p178986

public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
    }

    static boolean hasTeen(int a, int b, int c) {
        return (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19);
    }

}
