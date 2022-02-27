// question link https://codingbat.com/prob/p162477

public class TheEnd {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    static String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
}
