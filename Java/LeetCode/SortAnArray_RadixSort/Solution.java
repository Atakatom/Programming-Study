package SortAnArray_RadixSort;

class Solution {
    public int[] sortArray(int[] nums) {
        int min = minE(nums);
        boolean isMinMinus = min < 0;
        if (isMinMinus)
            nums = addToArr(nums, (min * -1));

        int max = maxE(nums);
        for (int pos = 1; max / pos > 0; pos *= 10) {
            nums = countSort(nums, pos);
        }
        if (isMinMinus)
            nums = addToArr(nums, min);
        return nums;

    }

    static int[] addToArr(int[] a, int x) {
        for (int i = 0; i < a.length; i++)
            a[i] += x;
        return a;
    }

    static int maxE(int[] a) {
        int max = 0;
        for (int i : a)
            if (i > max)
                max = i;
        return max;
    }

    static int minE(int[] a) {
        int min = 0;
        for (int i : a)
            if (min > i)
                min = i;
        return min;
    }

    static int[] countSort(int[] a, int pos) {
        int[] b = new int[a.length];
        int[] count = new int[10];
        int i = 0;
        for (i = 0; i < a.length; i++) {
            count[(a[i] / pos) % 10]++;
        }
        for (i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (i = a.length - 1; i >= 0; i--) {
            int index = --count[(a[i] / pos) % 10];
            b[index] = a[i];
        }
        return b;
    }
}
