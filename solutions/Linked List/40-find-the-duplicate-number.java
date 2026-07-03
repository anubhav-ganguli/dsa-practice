public class Solution {
    public int FindDuplicate(int[] nums) {
        
        int f=0,s=0;

        while(true)
        {
            s=nums[s];
            f=nums[nums[f]];

            if(s==f)
            {
                f=0;
                break;
            }
        }

        while(f!=s)
        {
            f=nums[f];
            s=nums[s];
        }

        return f;
    }
}