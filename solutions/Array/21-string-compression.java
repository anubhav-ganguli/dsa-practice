public class Solution {
    public int Compress(char[] chars) {
       
        int i=0,j=0,w=0;

        string s = string.Empty;
        int length=0;

        while(i<chars.Length)
        {
          
            while(j<chars.Length && chars[j]==chars[i])
            {
                j++;
            }
            chars[w++]=chars[i];
            if(j-i>1)
            {
                 s = Convert.ToString(j-i);
                char[] ss = s.ToArray();
                foreach(char cs in ss)
                {
                     chars[w++]=cs;
                }
            }
            i=j;
        }
            Console.WriteLine(new string(chars));
       // s=sb.ToString();
      //  s.CopyTo(chars);

        return w;
    }


    public int Compress_WithSpace(char[] chars) {
       
        int i=0,j=0;

        string s = string.Empty;
        StringBuilder sb= new StringBuilder();
        int length=0;

        while(i<chars.Length)
        {
            sb.Append(chars[i]);
            while(j<chars.Length && chars[j]==chars[i])
            {
                j++;
            }

            if(j-i>1)
            {
                sb.Append((j-i));
            }
            i=j;
        }
        s=sb.ToString();
        s.CopyTo(chars);

        return s.Length;
    }
}