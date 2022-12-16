//url: https://leetcode.com/problems/circular-sentence

class Solution {
    public boolean isCircularSentence(String sentence) {
        String words[]=sentence.split(" ");
        if(words.length==1)
        {
            if(words[0].charAt(0)==words[0].charAt(words[0].length()-1))
            return true;
            else
            return false;
        }
        int f=0,i=0;
        for(;i<words.length-1;i++)
        {
            if(words[i].charAt(words[i].length()-1)==words[i+1].charAt(0))
            {
                continue;
            }
            else
            {
                f=1;
                break;
            }
        }
        if(words[i].charAt(words[i].length()-1)!=words[0].charAt(0))
        {
           f=1;
        }
        if(f==1)
        return false;
        return true;
    }
}
