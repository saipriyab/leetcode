//https://leetcode.com/problems/lexicographically-smallest-palindrome/description/

class Solution {
    public String makeSmallestPalindrome(String s) {
        char arr[]=s.toCharArray();
        int i=0,j=0,k=arr.length-1;
        for(i=0;i<s.length();i++)
        {
            if(arr[j]<arr[k])
            {
               arr[k]=arr[j];
               j++;
               k--;
            }
            else
            {
                arr[j]=arr[k];
                j++;
                k--;
            }
        }
        return new String(arr);
    }
}
