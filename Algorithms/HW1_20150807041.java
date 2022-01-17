
import java.util.*;

public class HW1_20150807041 {

    public static void main(String[] args) {

        int[] sizesOfArrays = { 100, 1000, 10000 };
        for (int n : sizesOfArrays) {
            int[] arr = arrayGenerator(n);
            int k = findK(arr);
            System.out.println(k);
            Sorter.quickSort(arr, 0, arr.length - 1);
            printArray(arr);
        }
        int[] arr2 = { 1, 5, 2, 3, 8, 9, 23, 22, 23, -2 };
        printArray(arr2);
        Sorter.quickSort(arr2, 0, arr2.length - 1);
        printArray(arr2);

    }

    public static int[] arrayGenerator(int n) {
        int uniqueValueCounter = 0;
        long seed = Long.valueOf("20150807041");
        Random rand = new Random(seed);
        int[] arr = new int[n];
        boolean isItUnique;
        int index;
        while (uniqueValueCounter < n) {
            isItUnique = true;
            index = 0;
            int num = rand.nextInt();
            while (isItUnique && index <= uniqueValueCounter) {
                if (arr[index++] == num)
                    isItUnique = false;
            }
            if (isItUnique) {
                arr[uniqueValueCounter++] = num;
            }
        }
        return arr;
    }

    /**
     * Compares all the elements of unsorted array with its sorted version
     * to find which element is farthest from its sorted position
     * 
     * @param arr is the unsorted array
     * @return the absolute value of the difference of farthest elements indexes
     *         from sorted
     *         and unsorted array
     *         Asymptotic notation for finding k is O(n + n^2 + n + n) = O(n^2)
     */
    private static int findK(int[] arr) {
        int k = 0; /* O(1) */
        int[] arr2 = arr.clone(); /* O(n) */
        Sorter.quickSort(arr2, 0, arr.length - 1); /* O(n^2) */
        Map<Integer, Integer> m = new HashMap<>(); /* O(1) */
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], i); /* O(n) */
        }
        for (int i = 0; i < arr2.length; i++) {
            int originalIndex = m.get(arr2[i]);
            int diffOfIndexes = Math.abs(i - originalIndex);
            if (k < diffOfIndexes) { /* O(n) */
                k = diffOfIndexes;
            }
        }
        return k;
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

/**
 * References:
 * 
 * https://www.geeksforgeeks.org/nearly-sorted-algorithm/
 * https://www.geeksforgeeks.org/quick-sort/
 * 
 */
class Sorter {
    private Sorter() {
    }

    /**
     * Sorts the array by using priorityQueue to implement minHeap structure
     * Adds the first k+1 elements of array to minHeap
     * Removes the sorted elements of minHeap by adding them back to the
     * array starting from 0 as index (int a)
     * 
     * 
     * @param arr is the unsorted array
     * @param k   the element which is the most distanced from its sorted position
     */
    static void sortWithK(int[] arr, int k) {
        MinHeap mHeap = new MinHeap(k + 1);

        for (int i = 0; i < k + 1; i++) {
            mHeap.add(arr[i]);
        }

        int a = 0;
        for (int i = k + 1; i < arr.length; i++) {
            arr[a++] = mHeap.peek();
            mHeap.poll();
            mHeap.add(arr[i]);
        }

        while (mHeap.size() > 0) {
            arr[a++] = mHeap.peek();
            mHeap.poll();
        }
    }

    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            swap(arr, i, j);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

/**
 * Reference:
 * https://medium.com/@ankur.singh4012/implementing-min-heap-in-java-413d1c20f90d
 * 
 */
class MinHeap {

    private int capacity;
    private int size = 0;
    private int[] heap;

    MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int leftChild(int parentIndex) {
        return heap[getLeftChildIndex(parentIndex)];
    }

    private int rightChild(int parentIndex) {
        return heap[getRightChildIndex(parentIndex)];
    }

    private int parent(int childIndex) {
        return heap[getParentIndex(childIndex)];
    }

    private void swap(int index1, int index2) {
        int element = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = element;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity = capacity * 2;
        }
    }

    // Time Complexity : O(1)
    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return heap[0];
    }

    public int size() {
        return size;
    }

    // Time Complexity : O( Log n)
    public int poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        int element = heap[0];

        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return element;
    }

    // Time Complexity : O( Log n)
    public void add(int item) {
        ensureCapacity();
        heap[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;

        while (hasParent(index) && parent(index) > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int smallestChildIndex = getLeftChildIndex(index);

            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallestChildIndex = getRightChildIndex(index);
            }

            if (heap[index] < heap[smallestChildIndex]) {
                break;
            } else {
                swap(index, smallestChildIndex);
            }
            index = smallestChildIndex;
        }
    }
}
