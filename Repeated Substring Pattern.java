class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        String sub="";
        int repeat=0;
        for(int i=0;i<len/2;i++)
        {
            sub=s.substring(0,i+1);
            if(len%sub.length()==0)
            {
                repeat=len/sub.length();
                StringBuilder str=new StringBuilder();
                while(repeat>0)
                {
                    str.append(sub);
                    repeat--;
                }
                if(str.toString().equals(s))
                {
                    return true;
                }
            }
            
        }
        return false;
    }
}
