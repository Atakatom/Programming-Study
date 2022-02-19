// question link https://codingbat.com/prob/p112564

public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }

    static boolean or35(int n) {
        return (n % 5 == 0 || n % 3 == 0);
    }
}
