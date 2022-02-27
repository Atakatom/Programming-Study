// question link https://codingbat.com/prob/p125185

public class MixString {
    public String mixString(String a, String b) {
        String str = "";
        int x = Math.min(a.length(), b.length());
        for (int i = 0; i < x; i++) {
            str = str + a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        if (a.length() > b.length()) {
            str += a.substring(x);
        }
        str += b.substring(x);
        return str;
    }

}
