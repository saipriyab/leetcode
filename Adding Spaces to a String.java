url: https://leetcode.com/problems/adding-spaces-to-a-string/

class Solution {
    public String addSpaces(String s, int[] spaces) {
        int cnt=0,i=0;
        int index=spaces[cnt];
        StringBuilder res=new StringBuilder();
        if(spaces[cnt]==0)
        {
            res=res.append(' ');
            cnt++;
             if(cnt<spaces.length)
            index=spaces[cnt];
        }
        for(;i<s.length();i++)
        {
            if(i==index-1)
            {
                 res.append(s.charAt(i));
                res.append(' ');
               
                ++cnt;
                if(cnt<spaces.length)
                index=spaces[cnt];
            }
            else
            {
               res.append(s.charAt(i)); 
            }
            
        }
        return res.toString();
    }
}
