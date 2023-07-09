//https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[]=new int[nums.length];
        int j=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                res[j]=nums[i];
                j++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
            {
                res[j]=nums[i];
                j++;
            }
        }
         for(i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
            {
                res[j]=nums[i];
                j++;
            }
        }
        return res;
    }
}
