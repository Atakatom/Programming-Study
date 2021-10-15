package Labs;

// emreaydogan@akdeniz.edu.tr

public class CircularLinkedList {
    private static class Node {
        private int element;
        private Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }

        public int getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node n) {
            next = n;
        }
    }

    private Node tail = null;
    private int size = 0;

    public CircularLinkedList() {

    }

    public int size() {
        return size;
    }

    public int first() {
        if (size == 0)
            return 0;
        return tail.getNext().getElement();
    }

    public int last() {
        if (size == 0)
            return 0;
        return tail.getElement();
    }

    public void addFirst(int e) {
        if (size == 0) {
            tail = new Node(e, null);
            tail.setNext(tail);
        } else {
            Node newest = new Node(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(int e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public int removeFirst() {
        if (size == 0)
            return 0;
        Node head = tail.getNext();
        if (head.equals(tail))
            tail = null;
        else
            tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }

}
