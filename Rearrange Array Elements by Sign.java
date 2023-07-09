//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        int i=0,j=0,k=0;
        for(;i<nums.length;i++)
        {
            if(nums[i]<0)
            negative.add(nums[i]);
            else
            positive.add(nums[i]);
        }
        for(i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=positive.get(j);
                j++;
            }
            else
            {
                nums[i]=negative.get(k);
                k++;
            }
        }
        return nums;
    }
}
