// Welcome to WorkPad
// Start coding here...
public class Solution {

    //Using List
    public int[] MaxSlidingWindow_List(int[] nums, int k) {
        
       int i=0,j=0;

       List<int> max = new List<int>();

       List<int> result = new List<int>();

       while(j<nums.Length)
       {
          
            while(max.Any() && max.Last() < nums[j])
            {
                max.RemoveAt(max.Count-1);
            }

            max.Add(nums[j]);

            if(j-i+1==k)
            {
                result.Add(max.First());
                if(nums[i] == max.First())
                {
                     max.Remove(nums[i]);
                }
                i++;
            }

            j++;
           
       }

       return result.ToArray();

       


    }

    //Using LinkedList as a Deque (Monotonic decreasing pattern)
     public int[] MaxSlidingWindow(int[] nums, int k) {
        
       int i=0,j=0;

       LinkedList<int> max = new LinkedList<int>();

       List<int> result = new List<int>();

       while(j<nums.Length)
       {
          
            while(max.Count>0 && max.Last.Value < nums[j])
            {
                max.RemoveLast();
            }

            max.AddLast(nums[j]);

            if(j-i+1==k)
            {
                result.Add(max.First.Value);
                if(nums[i] == max.First.Value)
                {
                     max.RemoveFirst();
                }
                i++;
            }

            j++;
           
       }

       return result.ToArray();

       


    }
}