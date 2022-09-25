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

/**Approach 2 **/
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        char ch='0';
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(map.containsKey(ch))
            {
               ans=Math.max(ans,i-1-map.get(ch)); 
            }
            else
            {
                map.put(ch,i);
            }
        }
        return ans;
    }
}
