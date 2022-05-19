class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length>1)
        {
        Map<Character,Integer> map=new HashMap<>();
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            char arr[]=words[i].toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                if(map.containsKey(arr[j]))
                {
                    cnt=map.get(arr[j]);
                    map.put(arr[j],++cnt);
                }
                else
                {
                    map.put(arr[j],1);
                }
            }
        }
        int f=0;
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()%words.length==0)
            {
                f=1;
            }
            else
            {
                f=0;
                break;
            }
        }
        if(f==1)
            return true;
        else
            return false;
        
    }
        else
        return true;
    }
    
}
