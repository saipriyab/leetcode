//https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,len=0,mid=0;
        for(i=0;i<nums1.length;i++)
        list.add(nums1[i]);
        for(i=0;i<nums2.length;i++)
        list.add(nums2[i]);
        Collections.sort(list);
       len=list.size();
       if(len%2==0)
       {
           mid=len/2;
           return (double)(list.get(mid-1)+list.get(mid))/2;
       }
       else
       {
            mid=len/2;
            return (double)list.get(mid);
       }
       
    }
}
