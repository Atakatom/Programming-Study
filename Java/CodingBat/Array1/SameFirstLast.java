// link of the problem https://codingbat.com/prob/p118976

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return(nums.length>0 && nums[0] == nums[nums.length-1]);
    }      
}
