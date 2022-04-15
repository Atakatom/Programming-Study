// link of the problem https://codingbat.com/prob/p178728

public class TeenSum {
    
    public int teenSum(int a, int b) {
        if((a<20 && a>12)||(b>=13 && b<=19)){
          return 19;
        }
        return a+b;
      }
      
}
