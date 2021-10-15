package Labs;

public class CircularArray {
    private int[] circArray;
    private int capacity;

    public CircularArray(int size) {
        circArray = new int[size];
        capacity = -1;
    }

    /* Add an element to the last empty spot */
    public void add(int n) {
        capacity++;
        circArray[capacity] = n;
    }

    /* Delete an element at the given index */
    public void delete(int index) throws CanNotDelete {
        if (capacity == -1)
            throw new CanNotDelete("There is no element to delete in your array");
        // if the given index is bigger than amount of elements than we take the mode of
        // it
        if (index > capacity)
            index %= capacity;

        // We are shifting the elements to the left after index
        for (int i = index; i < capacity; i++)
            circArray[i] = circArray[i + 1];

        capacity--;
    }

    public void insert(int n, int index) throws ArrayIsFull {
        // If there are no elements in the array then we simply add n to the first
        if (capacity == -1)
            add(n);

        // If array is full then throws exception
        if (capacity == circArray.length - 1) {
            throw new ArrayIsFull("You can not insert a new element because your array is full");
        }

        capacity++;

        if (index > capacity)
            index %= capacity;

        // Shifting the array so that new element can be inserted
        for (int i = capacity; i >= index; i--)
            circArray[i] = circArray[i - 1];
        circArray[index - 1] = n;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            result.append((i + 1) + ".value is : " + circArray[i] + " | ");
        }
        return result.toString();
    }
}

class CanNotDelete extends Exception {
    public CanNotDelete(String s) {
        super(s);
    }
}

class ArrayIsFull extends Exception {
    public ArrayIsFull(String s) {
        super(s);
    }
}
