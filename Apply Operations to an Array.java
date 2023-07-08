//https://leetcode.com/problems/apply-operations-to-an-array/description/

//using extra array
class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0,j=0;
         for(i=0;i<nums.length-1;i++)
         {
             if(nums[i]==nums[i+1])
             {
                 nums[i]=(nums[i]*2);
                  nums[i+1]=0;
             }
             
         }
         int result[]=new int[nums.length];
         for(i=0;i<nums.length;i++)
         {
             if(nums[i]!=0)
             {
                 result[j]=nums[i];
                 j++;
             }
         }
         for(i=j;i<nums.length;i++)
         {
             result[i]=0;
         }
         return result;
    }
}



//without using extra array
class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0,index=0;
         for(i=0;i<nums.length-1;i++)
         {
             if(nums[i]==nums[i+1])
             {
                 nums[i]=(nums[i]*2);
                  nums[i+1]=0;
             }
             
         }
         
         for(i=0;i<nums.length;i++)
         {
             if(nums[i]!=0)
             {
                 nums[index]=nums[i];
                 index++;
                
             }
         }
         for(i=index;i<nums.length;i++)
         {
             nums[i]=0;
         }
         return nums;
    }
}

