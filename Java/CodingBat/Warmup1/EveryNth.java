// question link https://codingbat.com/prob/p196441

public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 3));
        System.out.println(everyNth("Miracle", 2));
    }

    static String everyNth(String str, int n) {
        String end = "";
        for (int i = 0; i < str.length(); i = i + n) {
            end = end + str.charAt(i);
        }
        return end;
    }
}
