public class Solution {
    public int MaxSubArray(int[] nums) {
        int max=nums[0];
        int curr=nums[0];

        int i=1;
        while(i< nums.Length)
        {           
            if(curr < 0 )
                curr=0;

            curr=curr+nums[i];

            max=Math.Max(max,curr);
            
            i++;
        }

        return max;
    }
}