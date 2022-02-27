// question link https://codingbat.com/prob/p126212

public class StringYak {

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

    static String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' && str.length() > i + 2 && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
