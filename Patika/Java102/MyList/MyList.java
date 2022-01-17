
package MyList;

/* Ben kendi liste yapımı Circular Linked List yapısını baz alarak tasarladım */
import java.util.Random;

class App {
    public static void main(String[] args) {
        int[] a = new int[7];
        Random rand = new Random();
        while (true) {
            for (int i = 0; i < a.length; i++)
                a[i] = rand.nextInt(9);
            if (100 * a[0] + 10 * a[1] + a[2] + 100 * a[0] + 10 * a[3] + a[4] == 100 * a[5] + 10 * a[6] + a[5])
                break;
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        /*
         * MyList<Integer> liste = new MyList<>();
         * System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
         * liste.add(10);
         * liste.add(20);
         * liste.add(30);
         * liste.add(40);
         * liste.add(20);
         * liste.add(50);
         * liste.add(60);
         * liste.add(70);
         * 
         * System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
         * 
         * // Bulduğu ilk indeksi verir
         * System.out.println("Indeks : " + liste.indexOf(20));
         * 
         * // Bulamazsa -1 döndürür
         * System.out.println("Indeks :" + liste.indexOf(100));
         * 
         * // Bulduğu son indeksi verir
         * System.out.println("Indeks : " + liste.lastIndexOf(20));
         * 
         * // Listeyi Object[] dizisi olarak geri verir.
         * Object[] dizi = liste.toArray();
         * System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
         * 
         * // Liste veri türünde alt bir liste oluşturdu
         * MyList<Integer> altListem = liste.subList(0, 3);
         * System.out.println(altListem.toString());
         * 
         * // Değerim listedeki olup olmadığını sorguladı
         * System.out.println("Listemde 20 değeri : " + liste.contains(20));
         * System.out.println("Listemde 120 değeri : " + liste.contains(120));
         * 
         * // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
         * liste.clear();
         * System.out.println(liste.toString());
         */
    }

}

public class MyList<T> {
    private class Node {
        private T val;
        private Node next;

        public Node() {
        }

        public Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }

        public T getValue() {
            return val;
        }

        public void setValue(T val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node tail;
    private int capacity;
    private int addCounter;

    public MyList() {
        tail = new Node();
        capacity = 10;
        addCounter = 0;
    }

    public MyList(int size) {
        tail = new Node();
        this.capacity = size;
        addCounter = 0;
    }

    public T getFirstValue() {
        return tail.getNext().getValue();
    }

    public T getLastValue() {
        return tail.getValue();
    }

    public T get(int index) {
        if (index > addCounter)
            return null;
        Node result = tail;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.next.getValue();
    }

    public T remove(int index) {
        if (index > addCounter)
            return null;
        if (index == 0)
            tail.setNext(tail.getNext().getNext());

        Node node = tail;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        if (index == addCounter - 1)
            tail = node;
        T disp = node.getNext().getValue();

        node.setNext(node.getNext().getNext());
        addCounter--;

        return disp;
    }

    public T set(int index, T data) {
        if (index > addCounter)
            return null;
        Node node = tail.getNext();
        while (index-- > 0)
            node = node.getNext();
        node.setValue(data);
        return node.getValue();
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return addCounter;
    }

    public void addFirst(T data) {
        tail = new Node(data, null);
        tail.setNext(tail);
    }

    public void add(T data) {
        if (capacity == addCounter)
            capacity *= 2;
        addCounter++;
        if (addCounter == 1)
            addFirst(data);
        else {
            Node newest = new Node(data, tail.getNext());
            tail.setNext(newest);
            tail = tail.getNext();
        }
    }

    public int indexOf(T data) {
        Node node = tail.getNext();
        for (int i = 0; i < addCounter; i++) {
            if (node.getValue().equals(data))
                return i;
            node = node.getNext();
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int index = -1;
        Node node = tail.getNext();
        for (int i = 0; i < addCounter; i++) {
            if (node.getValue().equals(data))
                index = i;
            node = node.getNext();
        }

        return index;
    }

    public boolean isEmpty() {
        return addCounter == 0;
    }

    public Object[] toArray() {
        Object[] arr = new Object[addCounter];
        Node node = tail.next;
        for (int i = 0; i < addCounter; i++) {
            arr[i] = node.getValue();
            node = node.getNext();
        }
        return arr;
        /*
         * Return edilen değer T[] olunca compile etsede runtime error veriyor ve
         * ClassCastException hatası alıyorum Bundan ötürü sadece bu methoda özel
         * Object[] döndürücem
         */
    }

    public void clear() {
        tail = new Node();
        capacity = 10;
        addCounter = 0;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> l = new MyList<>(finish - start);
        Node s = tail.getNext();
        int i;
        for (i = 0; i < start; i++) {
            s = s.getNext();
        }
        while (i++ <= finish) {
            l.add(s.getValue());
            s = s.getNext();
        }
        return l;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        int size = addCounter;
        Node node = tail.getNext();
        while (size-- > 0) {
            if (size == 0)
                str.append(node.getValue());
            else
                str.append(node.getValue() + ",");
            node = node.getNext();
        }
        str.append("]");
        return str.toString();
    }

}