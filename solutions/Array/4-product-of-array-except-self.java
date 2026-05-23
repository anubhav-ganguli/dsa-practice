public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.Length];
int[] rightArray = new int[nums.Length];
int[] result = new int[nums.Length];
int p = 1;
for (int i = 0; i < nums.Length; i++)
{
     leftArray[i] = p;
    p = nums[i] * p;

   
}

p = 1;
for (int i = nums.Length-1; i >= 0; i--)
{
     rightArray[i] = p;
    p = nums[i] * p;

   
}

for (int i = 0; i < nums.Length; i++)
{
    result[i] = leftArray[i] * rightArray[i];
}

return result;
    }
}