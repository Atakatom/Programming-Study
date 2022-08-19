// link of the problem https://codingbat.com/prob/p112409

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int[] x = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x[nums.length - (i + 1)] = nums[i];
        }
        return x;
    }
}
