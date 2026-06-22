   public class Solution
   {
       public IList<int> MajorityElement(int[] nums)
       { 

            int leader1=0,leader2=0,count1=0,count2=0;

            for(int i=0;i<nums.Length;i++)
            {
                if(count1 ==0 && nums[i]!=leader2)
                {
                    leader1=nums[i];
                    count1=1;
                }
                else if(nums[i] == leader1)
                {
                    count1++;
                }
                else if(count2==0 && nums[i]!=leader1)
                {
                    leader2=nums[i];
                    count2++;
                }
                else if(nums[i] == leader2)
                {
                    count2++;
                }
                else
                {
                    count1--;
                    count2--;
                }
            }


            int countLeader1=0;
            int countLeader2=0;
            for(int i=0;i<nums.Length;i++)
            {
                if(nums[i] == leader1 && count1>0)
                    countLeader1++;
                else  if(nums[i] == leader2  && count2>0)
                    countLeader2++;
            }

            if(countLeader1>nums.Length/3
                && countLeader2>nums.Length/3
            )
            {
                return new List<int> {leader1,leader2};
            }
            else  if(countLeader1>nums.Length/3
            )
            {
                return new List<int> {leader1};
            }
            else  if(countLeader2>nums.Length/3
            )
            {
                return new List<int> {leader2};
            }
            else
            {
                return new List<int>();
            }

       }
   }
