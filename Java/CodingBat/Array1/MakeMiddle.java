// link of the problem https://codingbat.com/prob/p199519

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int[] x = new int[2];
        x[0] = nums[(nums.length / 2) - 1];
        x[1] = nums[nums.length / 2];
        return x;
    }
}
