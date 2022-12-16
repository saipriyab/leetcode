//url: https://leetcode.com/problems/find-and-replace-pattern

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matchWords=new ArrayList();
        for(String word:words)
        {
            if(isIsomorphic(word,pattern))
            matchWords.add(word);
        }
        return matchWords;
    }

    public boolean isIsomorphic(String word,String pattern)
    {
        Map<Character,Character> wMap=new HashMap(),pMap=new HashMap();
        char a='0',b='0';
        for(int i=0;i<word.length();i++)
        {
            a=word.charAt(i);
            b=pattern.charAt(i);
            if(wMap.containsKey(a)&&wMap.get(a)!=b||pMap.containsKey(b)&&pMap.get(b)!=a)
            {
                return false;
            }
            wMap.put(a,b);
            pMap.put(b,a);

        }
        return true;
    }
}
