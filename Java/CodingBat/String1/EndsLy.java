// question link https://codingbat.com/prob/p103895

public class EndsLy {

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    static boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        }
        return false;
    }

}
