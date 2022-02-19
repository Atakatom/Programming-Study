// question link https://codingbat.com/prob/p115863

public class MiddleThree {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    static String middleThree(String str) {
        return str.substring(((str.length() - 1) / 2) - 1, (str.length() + 1) / 2 + 1);
    }

}
