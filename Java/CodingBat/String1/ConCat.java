// question link https://codingbat.com/prob/p132118

public class ConCat {
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }

    static String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        } else
            return a + b;
    }
}