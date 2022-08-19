// link of the problem https://codingbat.com/prob/p185139

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int x[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x[i] = nums[i];
        }
        nums[0] = x[1];
        nums[1] = x[2];
        nums[2] = x[0];
        return nums;
    }
}