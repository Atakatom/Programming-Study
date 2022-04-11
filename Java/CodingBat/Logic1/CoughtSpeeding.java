// link of the problem https://codingbat.com/prob/p157733

public class CoughtSpeeding {
    
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday==true){
          if(speed<=65){
            return 0;
          }
          if(speed<=85){
            return 1;
          }
          return 2;
        }
        if(speed<=60){
            return 0;
          }
          if(speed<=80){
            return 1;
          }
          return 2;
        
      }
      
}
