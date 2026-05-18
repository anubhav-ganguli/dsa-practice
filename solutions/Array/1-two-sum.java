// Welcome to WorkPad
// Start coding here...
public int[] TwoSum(int[] nums, int target) {
        
       	     int L = 0;
             			Dictionary<int,int> set= new Dictionary<int,int>();
                        while(L<nums.Length)
                        {
			  int complement = target - nums[L];
			  if(set.ContainsKey(complement))
			  {
			    
			    return new int[] {set[complement] , L};
          			    
			  }
			  else if(!set.ContainsKey(nums[L]))
              {
			  set.Add(nums[L],L);
              }
              L++;
                        }
			
            return new int[] {-1,-1};
            
                }