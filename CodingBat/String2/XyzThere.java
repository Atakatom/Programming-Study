// question link https://codingbat.com/prob/p136594

public class XyzThere {
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (i > 0) {
                if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) {
                    return true;
                }
            } else {
                if (str.substring(i, i + 3).equals("xyz")) {
                    return true;
                }
            }
        }
        return false;
    }
}
