// question link https://codingbat.com/prob/p142270

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }

    static String stringTimes(String str, int n) {
        int i = 0;
        String end = "";
        while (i != n) {
            end = end + str;
            i++;
        }
        return end;
    }
}
