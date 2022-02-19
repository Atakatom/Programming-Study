// question link https://codingbat.com/prob/p184031

public class ArrayCount9 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 9 };
        System.out.println(arrayCount9(arr));
        int[] arr2 = { 1, 9, 9 };
        System.out.println(arrayCount9(arr2));
        int[] arr3 = { 1, 9, 9, 3, 9 };
        System.out.println(arrayCount9(arr3));
    }

    static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count += 1;
            }
        }
        return count;
    }

}
