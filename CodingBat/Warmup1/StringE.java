// question link https://codingbat.com/prob/p173784

public class StringE {

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    static boolean stringE(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("e")) {
                result++;
            }
        }
        return (1 <= result && result < 4);
    }
}
