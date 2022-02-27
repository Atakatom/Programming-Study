// question link https://codingbat.com/prob/p117334

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    static String stringSplosion(String str) {
        String end = "";
        for (int i = 0; i < str.length(); i++) {
            end = end + str.substring(0, i + 1);
        }
        return end;
    }
}
