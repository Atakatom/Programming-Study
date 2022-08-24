// link of the problem https://codingbat.com/prob/p101230

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int[] end = new int[2];
        end[0] = nums[0];
        end[1]= nums[nums.length-1];
        return end;
      }      
}
