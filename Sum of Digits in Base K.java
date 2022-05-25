class Solution {
    public int sumBase(int n, int k) {
       String num= Integer.toString(Integer.parseInt(String.valueOf(n), 10), k);
       int sum=0;
        char arr[]=num.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+Character.getNumericValue(arr[i]);
        }
        
        return sum;
    }
}

leetcode url: https://leetcode.com/problems/sum-of-digits-in-base-k/
