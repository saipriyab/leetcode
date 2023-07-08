//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

class Solution {
    public int dominantIndex(int[] nums) {
        //find largest num and index of that
        int max=Integer.MIN_VALUE,index=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                index=i;
            }
        }
        //check other nums
        for(i=0;i<nums.length;i++)
        {
            if(i!=index)
            {
               if(!((nums[i]*2)<=max))
               {
                   return -1;
               }
              
            }
        }
        return index;
    }
}
