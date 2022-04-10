// link of the problem https://codingbat.com/prob/p191363

public class MakeChocolate {
    
    public int makeChocolate(int small, int big, int goal) {
        int mod=goal%5;
        if( mod>small){return -1;}
        if(big*5+small<goal){return -1;}
      
        if(big*5>goal){return mod;}
        return goal-(big*5);
      }
      
}
