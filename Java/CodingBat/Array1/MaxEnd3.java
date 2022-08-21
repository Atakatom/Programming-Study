// link of the problem https://codingbat.com/prob/p146256
public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int x=Math.max(nums[0],nums[nums.length-1]);
        for(int i=0;i<nums.length;i++){
          nums[i]=x;
        }
        return nums;
      }
      
}
