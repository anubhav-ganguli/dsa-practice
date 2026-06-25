public class Solution {
    public int LengthOfLongestSubstring(string s) {
        
        int i=0,j=0;

        char[] c = s.ToArray();

        HashSet<char> set = new HashSet<char>();

        int length=0;
        int max=0;
        while(j<s.Length)
        {
            if(!set.Contains(c[j]))
            {
                set.Add(c[j]);               
            }
            else
            {
               while(set.Contains(c[j]))
               {
                  set.Remove(c[i]);
                  i++;
               }

               set.Add(c[j]); 
            }

            max=Math.Max(max,j-i+1);
            j++;
        }

        return max; 
    }
}