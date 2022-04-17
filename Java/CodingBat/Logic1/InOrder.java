// link of the problem https://codingbat.com/prob/p154188

public class InOrder {

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return((bOk==true && c>b) || (b>a && c>b));
    }
      
}
