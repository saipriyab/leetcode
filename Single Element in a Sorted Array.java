//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

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

//uisng HashSet
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                set.remove(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return set.stream().findFirst().get();
    }
}
