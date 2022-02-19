// question link https://codingbat.com/prob/p151713

public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("plz snacks"));
    }

    static boolean mixStart(String str) {
        if (str.length() > 2) {
            return (str.substring(1, 3).equals("ix"));
        }
        return false;
    }
}
