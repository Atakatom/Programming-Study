// link of the problem https://codingbat.com/prob/p137188

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] x = new int[2 * nums.length];
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                x[i] = nums[nums.length - 1];
            } else {
                x[i] = 0;
            }
        }
        return x;
    }
}
