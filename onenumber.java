public class onenumber {
     
        public int singleNumber(int[] nums) 
        {
            int i,j,sum=0,sum1=0;
            for(i=0;i<nums.length;i++)
            {sum1=sum1+nums[i];
                for(j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        sum=sum+2*nums[j];
                    }
                }
            }
            return sum1-sum;
        }
    public static void main(String[] args)
    {
        
    }
    
}
