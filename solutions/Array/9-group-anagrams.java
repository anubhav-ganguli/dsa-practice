public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
           
            
        Dictionary<string, List<string>> set = new Dictionary<string, List<string>>();

        

        for(int i = 0; i < strs.Length;i++)
        {
            //prepare key for each string
            int[] keyArray = new int[26];
            foreach(char c in strs[i])
            {
                keyArray[c - 'a']++;
            }
            StringBuilder keyBuilder= new StringBuilder();
            foreach(int keyChar in keyArray)
            {
                keyBuilder.Append(keyChar);
                keyBuilder.Append("#");
            }

            string key = keyBuilder.ToString();


            if(!set.ContainsKey(key))
            {
                set.Add(key,new List<string>() { strs[i] });
            }
            else
            {
                set[key].Add(strs[i]);
            }


        }

        List<List<string>> result = new List<List<string>>();
        foreach (KeyValuePair<string,List<string>> keyValuePair in set)
        {
            result.Add(keyValuePair.Value);

        }

        return result.ToList<IList<string>>();


    }
}