// link of the problem https://codingbat.com/prob/p115233

public class WithoutDoubles {
    
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles==true && die1==die2){
          if(die1==6){die1=0;}
          return die1+die2+1;
        }
        return die1+die2;
    }
      
}
