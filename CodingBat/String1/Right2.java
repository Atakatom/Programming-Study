// question link https://codingbat.com/prob/p130781

public class Right2 {
    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }

    static String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
