// question link https://codingbat.com/prob/p194667

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    static int countXX(String str) {
        int end = 0;
        for (int i = 0; i + 1 < str.length(); i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                end++;
            }
        }
        return end;
    }
}
