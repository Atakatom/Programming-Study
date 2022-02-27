// question link https://codingbat.com/prob/p199216

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    static String seeColor(String str) {
        if (str.length() > 2) {
            if (str.substring(0, 3).equals("red")) {
                return "red";
            }
        }
        if (str.length() > 3) {
            if (str.substring(0, 4).equals("blue")) {
                return "blue";
            }
        }
        return "";
    }
}