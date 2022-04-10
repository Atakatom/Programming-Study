// link of the problem https://codingbat.com/prob/p198700   

public class EvenlySpaced {
    
    public boolean evenlySpaced(int a, int b, int c) {
        if(c>=b && c>=a){
          if(Math.abs(b-a) == c-Math.max(a,b)){
            return true;
          }
        }
        if(a>=b && a>=c){
          if(Math.abs(b-c) == a-Math.max(c,b)){
            return true;
          }
        }
        if(b>=a && b>=c){
          if(Math.abs(c-a) == b-Math.max(a,c)){
            return true;
          }
        }
        return false;
      }

}
