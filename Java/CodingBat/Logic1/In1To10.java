// link of the problem https://codingbat.com/prob/p137365

public class In1To10 {
    
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode==true){
          return(n<=1 || n>=10);
        }
        return(n>=1 && n<=10);
      }
      
}
