public class Solution {

    //Take a leader and make count as 1. Iterate over elements.If leader same, count++,if leader not same, count--
    public int MajorityElement(int[] nums) {
        int leader=nums[0];

        int count = 1;

         for(int i=1;i<nums.Length;i++)
         {
            if(count==0)
            {
                leader = nums[i];
                count=1;
            }
            else if(nums[i] == leader)  
              {
                count++;
              }
            else if(nums[i] != leader)  
              {
                count--;
              }


              
         }
        return leader;
    }
}