// link of the question https://codingbat.com/prob/p183562

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        if(small+5*big<goal){return false;}
        if(small+5*big==goal){return true;}
        int mod=goal%5;
        if(mod>small){return false;}
        return true;
      }
      
}
