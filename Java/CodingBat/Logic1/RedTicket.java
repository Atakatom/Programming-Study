// link of the problem https://codingbat.com/prob/p170833

public class RedTicket {

    public int redTicket(int a, int b, int c) {
        if(a==b && b==c){
            if(c==2)
                return 10;
            return 5;
        }
        if(a!=b && a!=c)
            return 1;
        return 0;
    }
      
}
