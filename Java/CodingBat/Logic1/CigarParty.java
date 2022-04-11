// link of the problem https://codingbat.com/prob/p159531

public class cigarParty{
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend==true && cigars>=40 ){
        return true;
        }
        if(isWeekend==false && cigars>=40 && cigars<=60){
        return true;
        }
        return false;
    }
  
}