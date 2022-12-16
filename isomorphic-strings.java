//url: https://leetcode.com/problems/isomorphic-strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap=new HashMap(),tMap=new HashMap();
        char a='0',b='0';
        for(int i=0;i<s.length();i++)
        {
            a=s.charAt(i);
            b=t.charAt(i);
            if(sMap.containsKey(a)&&sMap.get(a)!=b||
            tMap.containsKey(b)&&tMap.get(b)!=a)
            {
                return false;
            }
            sMap.put(a,b);
            tMap.put(b,a);
        }
        return true;
    }
}
