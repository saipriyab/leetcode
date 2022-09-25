url: https://leetcode.com/problems/check-distances-between-same-letters/

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int diff=-1;
        String sub="";
        for(int i=0;i<s.length();i++)
        {
           for(int j=i+1;j<=s.length();j++)
           {
               sub=s.substring(i,j);
               if(sub.charAt(0)==sub.charAt(sub.length()-1))
               {
                   if(sub.length()-2>diff)
                   {
                       diff=sub.length()-2;
                   }
               }
           }
        }
        return diff;
    }
}
