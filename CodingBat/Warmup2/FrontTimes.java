// question link https://codingbat.com/prob/p101475

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

    static String frontTimes(String str, int n) {
        int i = 0;
        String end = "";
        while (i != n) {
            if (str.length() > 2) {
                end = end + str.substring(0, 3);
            } else {
                end = end + str;
            }
            i++;
        }
        return end;
    }
}
