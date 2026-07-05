public class Solution {
    public int FirstMissingPositive(int[] nums) {
        
      int junk = nums.Length+1;
      int i=0;

      //Replace negative numbers using the junk value
      while(i<nums.Length)
      {
        if(nums[i] <= 0)
        {
            nums[i] = junk;
        }
        i++;
      }

      i=0;
      //Negate all the numbers based on index-1
      while(i<nums.Length)
      {
          int index = Math.Abs(nums[i])-1;

          if(index < nums.Length && nums[index] > 0)
          {
              nums[index] = nums[index]*-1;
          }

          i++;
      }
      

     i=0;
     //Find first positive number and return index+1
      while(i<nums.Length)
      {
          if(nums[i] >0)
            return i+1;

         i++;
      }
 
      return i+1;
    }


    public int FirstMissingPositive_Space(int[] nums) {
        
        HashSet<int> set = new HashSet<int>(nums);

        int missing=1;

        while(set.Contains(missing))
        {
            missing++;
        }

        return missing;
    }
}