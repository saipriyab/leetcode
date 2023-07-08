//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/


class Solution {
    public int findMaxK(int[] nums) {
        int max=-1,i=0,j=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            for(j=nums.length-1;j>=0;j--)
            {
                if(nums[i]+nums[j]==0)
                {
                    max=nums[i];
                }
            }
        }
        return max;
    }
}
