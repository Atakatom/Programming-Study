// question link https://codingbat.com/prob/p105745

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        }
        return a.substring(a.length() - b.length()) + b;
    }
}
