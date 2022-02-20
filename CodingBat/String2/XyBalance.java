// question link https://codingbat.com/prob/p134250

public class XyBalance {
    public boolean xyBalance(String str) {
        int a = str.lastIndexOf("y");
        int b = str.lastIndexOf("x");
        return (a >= b);
    }
}
