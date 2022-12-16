//url: https://leetcode.com/problems/maximum-value-of-a-string-in-an-array
class Solution {
    public int maximumValue(String[] strs) {
    int max_length=0;
    for(String str:strs)
    {
        max_length=Math.max(max_length,isDigit(str)?Integer.valueOf(str):str.length());
    }
    return max_length;
    }
        
    public boolean isDigit(String str)
    {
        for(char ch:str.toCharArray())
        {
            if(Character.isLetter(ch))
            return false;
        }
        return true;
    }
}
