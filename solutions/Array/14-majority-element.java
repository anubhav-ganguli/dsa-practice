class Result
{

    /*
     * Complete the 'majorityElement' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static int majorityElement(int n, List<int> arr)
    {
        int leader=arr[0];
        int count = 1;

        for(int i=0;i<arr.Count;i++)
        {
            Console.Write(arr[i]+",");
        }
        
        for(int i=1;i<arr.Count;i++)
        {
            if(count==0)
            {
                leader=arr[i];
                count=1;
            }
            else if(leader == arr[i])
            {
                count++;
            }
            else if(arr[i] !=leader)
            {
                count--;
            }
        }
        
        
        int leaderCount=0;
        for(int i=0;i<arr.Count;i++)
        {
            if(leader == arr[i])
               leaderCount++;
        }  
        if(leaderCount>=n/2)      
        return leader;
        else return -1;
    }

}