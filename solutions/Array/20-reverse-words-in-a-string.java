public class Solution {
    public string ReverseWords(string s) {
        
        string[] words = s.Split(" ");

        StringBuilder str = new StringBuilder();
       
       for(int i=words.Length-1;i>=0;i--)
       {
            if(!string.IsNullOrEmpty(words[i]))
            {
                str.Append(words[i]);
                str.Append(" ");
            }
       }

       return str.ToString().Trim();


        

    }
}