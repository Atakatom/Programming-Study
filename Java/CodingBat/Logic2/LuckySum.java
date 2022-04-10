// link of the question https://codingbat.com/prob/p130788

public class LuckySum {
    
    public int luckySum(int a, int b, int c) {
        if((a==b && a==13) || (a==c && a==13)){
          return 0;
        }
        if(a==13){return 0;}
        if(b==13){return a;}
        if(c==13){return a+b;}
        return a+b+c;
      }
      
}
