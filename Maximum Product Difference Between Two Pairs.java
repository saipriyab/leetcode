//Brtue Force
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1]*nums[nums.length-2];
        int min=nums[0]*nums[1];
        return max-min;
        
    }
}

//Optimal Solution
class Solution {
    public int maxProductDifference(int[] nums) {
      int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,
      min1=Integer.MAX_VALUE,min2=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]>=max1)
          {
              max2=max1;
              max1=nums[i];
          }
         if(nums[i]>=max2&&nums[i]<max1)
          {
              max2=nums[i];
          }
             if(nums[i]<=min1)
          {
              min2=min1;
              min1=nums[i];
          }
          if(nums[i]<min2&&nums[i]>min1)
          {
              min2=nums[i];
          }
      }
        return (max2*max1)-(min2*min1);
    }
}
