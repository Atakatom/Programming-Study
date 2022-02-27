// question link https://codingbat.com/prob/p198640

public class StringMatch {

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    static int stringMatch(String a, String b) {
        int count = 0;
        int x = Math.min(a.length(), b.length());
        for (int i = 0; i < x - 1; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                if (a.charAt(i + 1) == b.charAt(i + 1)) {
                    count++;
                }
            }
        }
        return count;
    }

}
