// question link https://codingbat.com/prob/p184030

public class MakeOutWord {

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }

    static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
