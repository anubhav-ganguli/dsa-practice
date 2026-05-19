public class Solution {
    public int RemoveDuplicates(int[] nums) {
        
        int f=0;

        for(int i=0;i<nums.Length;i++)
        {
            if(nums[i]!=nums[f])
            {
                f++;
                nums[f] = nums[i];
            }
        }

        return f+1;
       
}
}