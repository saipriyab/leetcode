//https://leetcode.com/problems/most-frequent-even-element/description/

class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
            map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
        }
       int max=-1,cnt=Integer.MIN_VALUE;
       for(Map.Entry<Integer,Integer> m:map.entrySet())
       {
           if(m.getValue()>cnt)
           {
                cnt=m.getValue();
                max=m.getKey();
           }
       }
       return max; 
    }
}
