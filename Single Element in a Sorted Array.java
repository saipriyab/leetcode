class Solution {
    public int singleNonDuplicate(int[] nums) {
        int cnt=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                cnt++;
            }
            else
            {
                if((i+2)<nums.length)
                {
                if((nums[i]!=nums[i+1])&&(nums[i+1]!=nums[i+2]))
                {
          
                    return nums[i+1];
                }
                }
                else
                {
                   if((nums[i]!=nums[i+1]))
                {
                                     return nums[i+1];
                } 
                }
            }
        }
        return nums[0];
    }
}
