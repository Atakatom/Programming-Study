public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 7, 9, 2, 11, 2, 17, 23, 3 };
        printArray(arr);
        sort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int j = partition(arr, l, h);
            sort(arr, l, j - 1);
            sort(arr, j + 1, h);
        }
    }

    static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
