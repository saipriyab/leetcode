//https://leetcode.com/problems/replace-words/description/

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String result="",val="";
       Collections.sort(dictionary);
        String words[]=sentence.split("\\s");
        int f=1;
        for(int i=0;i<words.length;i++)
        {
            f=0;
            val="";
            for(String str:dictionary)
            {
                if(words[i].startsWith(str))
                {
                    f=1;
                    val=str;
                    break;
                 
                }
            }
            if(f==1)
            result=result+val+" ";
            else
            result=result+words[i]+" ";
        }
        return result.trim();
    }
}
