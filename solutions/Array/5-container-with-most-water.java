public class Solution {
    public int MaxArea(int[] height) {
        
        int L = 0;
int R = height.Length - 1;

int max = 0;
int minHeight = 0;

while(L<R)
{
    minHeight = Math.Min(height[L], height[R]);
    max = Math.Max(max, minHeight * (R - L));

    if (height[L] < height[R])
    {
        L++;
    }
    else
    {
        R--;
    }

}

return max;
}
}