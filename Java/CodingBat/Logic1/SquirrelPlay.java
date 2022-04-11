// link of the problem https://codingbat.com/prob/p141061

public class SquirrelPlay {
    
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer==true){
          return(temp>=60 && temp<=100);
        }
        return(temp>=60 && temp<=90);
      }

}
