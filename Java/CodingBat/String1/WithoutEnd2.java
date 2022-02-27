// question link https://codingbat.com/prob/p174254

public class WithoutEnd2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("abc");
        System.out.println("ab");
    }

    static String withouEnd2(String str) {
        if (str.length() > 1) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }
}
