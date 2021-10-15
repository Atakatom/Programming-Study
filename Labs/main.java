package Labs;

public class main {
    public static void main(String[] args) throws Exception {
        CircularArray ca = new CircularArray(5);
        ca.insert(1, 1);
        System.out.println(ca);
        ca.insert(2, 1);
        System.out.println(ca);
        ca.insert(3, 1);
        System.out.println(ca);
        ca.insert(4, 3);
        System.out.println(ca);
        ca.delete(2);
        System.out.println(ca);
        ca.insert(2, 3);
        System.out.println(ca);
        ca.insert(2, 5);
        System.out.println(ca);
    }

}
