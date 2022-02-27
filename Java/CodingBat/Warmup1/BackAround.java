// question link https://codingbat.com/prob/p161642

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    static String backAround(String str) {
        String a = str.substring(str.length() - 1);
        return a + str + a;
    }
}
