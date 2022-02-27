// question-link https://codingbat.com/prob/p161056

public class MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }

    static String makeAbba(String a, String b) {
        return (a + b + b + a);
    }

}
