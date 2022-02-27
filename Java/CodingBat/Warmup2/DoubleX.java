// question link https://codingbat.com/prob/p186759

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i != -1 && i != str.length() - 1) {
            if (str.charAt(i + 1) == 'x') {
                return true;
            }
            if (i == -1) {
                return true;
            }
        }
        return false;
    }
}
