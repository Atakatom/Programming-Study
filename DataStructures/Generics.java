package DataStructures;

public class Generics {
    public static <E> void printArray(E[] arr) {
        for (E item : arr) {
            System.out.println(item);
        }
    }
}
