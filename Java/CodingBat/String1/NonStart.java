
// question link https://codingbat.com/prob/p143825

public class NonStart {
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));

    }

    static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

}