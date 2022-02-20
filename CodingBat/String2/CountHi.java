// question link https://codingbat.com/prob/p147448

public class CountHi {
    public int countHi(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
          if(str.charAt(i)=='h' && str.charAt(i+1)=='i'){
            count++;
          }
        }
        return count;
      }
}
