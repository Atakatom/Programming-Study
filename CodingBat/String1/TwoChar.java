// question link https://codingbat.com/prob/p144623

public class TwoChar {
    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }

    static String twoChar(String str, int index) {
        if (str.length() - 1 <= index || index < 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
