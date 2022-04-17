// link of the problem https://codingbat.com/prob/p192267

public class BlueTicket {

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10)
            return 10;
        if (a + b >= a + c + 10 || a + b >= b + c + 10)
            return 5;
        return 0;
    }

}
