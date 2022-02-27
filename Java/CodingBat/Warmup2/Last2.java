// question link https://codingbat.com/prob/p178318

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    static int last2(String str) {
        if (str.length() < 3) {
            return 0;
        }
        String end = str.substring(str.length() - 2);
        int x = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(end)) {
                x++;
            }
        }
        return x;
    }
}
