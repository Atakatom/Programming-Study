// link of the problem https://codingbat.com/prob/p140272

public class InOrderEqual {

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(equalOk==true){
          return (a<=b && b<=c);
        }
        return (a<b && b<c);
    }
      
}
