class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        int start=0,end=nums.length-1;
        while(start<=end)
        {
           if(start!=end)
           {
           sum+=Long.parseLong(String.valueOf(nums[start])+String.valueOf(nums[end]));
           }
           else
           {
               sum+=nums[start];
           } 
           start++;
           end--;
           
        }
        return sum;
    }
}
