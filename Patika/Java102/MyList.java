package Patika.Java102;

/* Ben kendi liste yapımı Circular Linked List yapısını baz alarak tasarladım */

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