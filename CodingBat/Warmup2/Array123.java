// question link https://codingbat.com/prob/p136041

public class Array123 {

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && i + 2 < nums.length) {
                if (nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
