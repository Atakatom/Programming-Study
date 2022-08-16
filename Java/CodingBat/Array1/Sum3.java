// link of the problem https://codingbat.com/prob/p175763

public class Sum3 {
    public int sum3(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        return result;
    }
}
