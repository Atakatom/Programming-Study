// link of the problem https://codingbat.com/prob/p171022

public class Has23 {
    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
