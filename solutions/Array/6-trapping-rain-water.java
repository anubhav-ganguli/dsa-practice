public class Solution {
    public int Trap(int[] height) {
        
        //computer left max
        int[] leftMax = new int[height.Length];

        int max=Int32.MinValue;

        for(int i=0;i<height.Length;i++)
        {
            max = Math.Max(max,height[i]);
            leftMax[i]=max;
        }

        //computer right max
        int[] rightMax = new int[height.Length];

         max=Int32.MinValue;

        for(int i=height.Length - 1;i>=0;i--)
        {
            max = Math.Max(max,height[i]);
            rightMax[i]=max;
        }

        //for each index, find out the water. Min of left and right max minus the height
        int water=0;
        for(int i=0;i<height.Length;i++)
        {
            water= water + (Math.Min(leftMax[i],rightMax[i]) - height[i]);
        }

        return water;

}
}