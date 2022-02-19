// question link https://codingbat.com/prob/p172267

public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}