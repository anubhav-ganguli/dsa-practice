public class Solution {

    //Add to HashMap and Order:  TC : nlogn SC : n
     public int[] TopKFrequent_HashMap_Sort(int[] nums, int k) {

            Dictionary<int,int> set = new Dictionary<int,int>();

            for(int i =0;i<nums.Length;i++)
            {
                if(!set.ContainsKey(nums[i]))
                    set.Add(nums[i],1);
                else
                    set[nums[i]]++;
            }

            set=  set.OrderByDescending(x=>x.Value).ToDictionary();

            int[] result = new int[k];
            int counter = 0;
            foreach(KeyValuePair<int,int> kv in set)
            {  
                result[counter++] =kv.Key; 

                if(counter == k)
                    break;
            }

            return result;
     }


    //Create HashMap
    //check for highest from hashmap.
    //take the highest element to result . Remove highest from the map
    //Loop again
    //TopKFrequent_HashMap_Remove
     public int[] TopKFrequent_HashMap_Remove(int[] nums, int k) {

             Dictionary<int,int> set = new Dictionary<int,int>();

            for(int i =0;i<nums.Length;i++)
            {
                if(!set.ContainsKey(nums[i]))
                    set.Add(nums[i],1);
                else
                    set[nums[i]]++;
            }

            int[] result = new int[k];


           
              for(int i=0;i<k;i++)
            {
                 int max=Int32.MinValue;
            int maxKey=0;
           foreach(KeyValuePair<int,int> kv in set)
            {  
                if(kv.Value> max)
                {
                    max=kv.Value;
                    maxKey=kv.Key;
                }
            }
            result[i] = maxKey;
            set.Remove(result[i]);


            }

            return result;
     }

      //Create Hashmap
      //Reverse the hasmap .Create a second hashmap
      //Traverse from the length to hashmap to zero. Check if each number is present in the second hasmp for k times. If present, add to hashmap till k ends
      public int[] TopKFrequent(int[] nums, int k) {

        Dictionary<int,int> set = new Dictionary<int,int>();
         Dictionary<int,List<int>> secondSet = new Dictionary<int,List<int>>();

            for(int i =0;i<nums.Length;i++)
            {
                if(!set.ContainsKey(nums[i]))
                    set.Add(nums[i],1);
                else
                    set[nums[i]]++;
            }



            foreach(KeyValuePair<int,int> kv in set)
            {  
                 if(!secondSet.ContainsKey(kv.Value))
                    secondSet.Add(kv.Value,new List<int>{ kv.Key});
                else
                    secondSet[kv.Value].Add(kv.Key);
            }

            List<int> result = new List<int>();
            int counter = 0;
             for(int i =nums.Length;i>=0;i--)
            {  
                if(secondSet.ContainsKey(i))
                {
                     result.AddRange(secondSet[i]);
                     counter=counter+secondSet[i].Count;
                }

                if(counter >= k)
                    break;
            }

            return result.ToArray();

      }



}