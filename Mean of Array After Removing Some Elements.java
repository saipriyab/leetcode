//https://leetcode.com/problems/mean-of-array-after-removing-some-elements/description/

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double cnt=0.05*arr.length;
        int sum=0;
        for(int i=(int)cnt;i<arr.length-cnt;i++)
        {
            sum=sum+arr[i];
        }
       return (sum/(arr.length-(cnt*2))); 
    }
}
