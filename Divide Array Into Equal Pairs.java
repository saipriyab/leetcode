//https://leetcode.com/problems/divide-array-into-equal-pairs/description/

class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        int cnt=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if((m.getValue()%2)==0)
            {
                cnt+=m.getValue()/2;
            }
        }
        if(cnt==(nums.length/2))
        return true;
        return false;
    }
}
