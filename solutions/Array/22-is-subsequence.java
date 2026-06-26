public class Solution {
    public bool IsSubsequence(string s, string t) {
        
        int i=0,j=0;

        while(j < t.Length)
        {
            if(i < s.Length && s[i] == t[j])
            {
                i++;
            }
            j++;
        }

        if(i == s.Length)
           return true;

    return false;

    }
}