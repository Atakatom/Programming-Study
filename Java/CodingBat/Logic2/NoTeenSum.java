// link of the question https://codingbat.com/prob/p182879

public class NoTeenSum {
    
    public int fixTeen(int n){
        if(n<20 && n>12 && n!=15 && n!=16){
         return n=0;
        }
        return n;
      }
    public int noTeenSum(int a, int b, int c) {
      return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    
}
