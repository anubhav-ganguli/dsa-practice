public class Solution {


//O(n) space complexity
 public void Rotate_WithSpace(int[] nums, int k) {

        //Simplifying k
        if(k>nums.Length)
           k = k%nums.Length;

        int[] result= new int[nums.Length];

        int counter=0;
        //Copying the last part to new array
        for(int i=nums.Length-k ; i<nums.Length;i++)
        {
            result[counter++]=nums[i];
        }

        //copying the rest to new array
          for(int i=0 ; i<nums.Length-k;i++)
        {
            result[counter++]=nums[i];
        }

        //Assigning the new array to the input
          for(int i=0 ; i<nums.Length;i++)
        {
            nums[i]=result[i];
        }
 }


    //Better Approach : Reversing the array O(1) Space Complexity
    //Reversing technique
    public void Rotate(int[] nums, int k) {
        if(k > nums.Length)
            k = k%nums.Length;
     

     //Reversing entire array
        int L = 0;
        int R = nums.Length - 1;

        while (L < R)
        {
            int temp = nums[L];
            nums[L] = nums[R];
            nums[R] = temp;
            L++;
            R--;
            
        }

        //Reversing first part
         L = 0;
         R =nums.Length ==1? 0: k - 1;

        while (L < R)
        {
            int temp = nums[L];
            nums[L] = nums[R];
            nums[R] = temp;
            L++;
            R--;
            
        }

         //Reversing second first part
         L = k;
         R = nums.Length - 1;

        while (L < R)
        {
            int temp = nums[L];
            nums[L] = nums[R];
            nums[R] = temp;
            L++;
            R--;
            
        }




    }
}