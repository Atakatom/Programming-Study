// question link https://codingbat.com/prob/p191022

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

    static boolean startHi(String str) {
        return (str.length() > 1 && (str.substring(0, 2).equals("hi")));
    }
}
