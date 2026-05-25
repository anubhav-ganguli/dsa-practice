public class Solution {
    
    public int MissingNumber(int[] nums) {
        
       //return MissingNumberByHashSet(nums);

       return MissingNumberByXOR(nums);

    }


    public int MissingNumberByHashSet(int[] nums) {
        
        HashSet<int> set = new HashSet<int>(nums);
        for(int i=0;i<=nums.Length;i++)
        {
            if(!set.Contains(i))
            {
                return i;
            }
        }

        return -1;

    }

     public int MissingNumberByXOR(int[] nums) {
        
        //XOR of any element with itself is 0.
        //XOR of any element with 0 is the element itself.
        //XOR of all elemenets from 0 to n , now XOR ing each element from input will cancel the elements and will be left with the missing element

        //XORing all the elements
        int XOR=0;
        for(int i=0;i<=nums.Length;i++)
        {
            XOR=XOR^i;
        }

        //to find missing elements from input,xor each element with the xor
        for(int i=0;i<nums.Length;i++)
        {
            XOR=XOR^nums[i];
        }

        return XOR;
    }
}