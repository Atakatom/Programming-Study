// link of the problem https://codingbat.com/prob/p138990

public class CloseFar {
    
    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(a-b)<=1) && (c<a-1 || c>a+1) && (c<b-1 || c>b+1)) || (Math.abs(a-c)<=1 && (b<a-1 || b>a+1) && (b<c-1 || b>c+1));
    }
}
