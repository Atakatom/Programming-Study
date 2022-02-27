// question link https://codingbat.com/prob/p151359

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            str = str.substring(2);
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            return str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(1) == 'x') {
            return str = str.substring(0, 1) + str.substring(2);
        }
        return str;
    }
}
