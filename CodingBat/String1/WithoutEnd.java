// question link https://codingbat.com/prob/p130896

public class WithoutEnd {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("java");
        System.out.println("coding");
    }

    static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

}