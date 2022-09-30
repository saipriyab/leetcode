class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Integer,Integer> distanceMap=new LinkedHashMap<>();
        int i=0;
        for(i=0;i<s.length();i++)
        {
            if(!distanceMap.containsKey(((int)(s.charAt(i))-97)))
            {
               distanceMap.put(((int)(s.charAt(i))-97),(s.lastIndexOf(s.charAt(i))-s.indexOf(s.charAt(i))));
            }
           
        
        }
        for(i=0;i<distance.length;i++)
        {
           if(distanceMap.containsKey(i))
           {
               if(distanceMap.get(i)-1!=distance[i])
               {
                 return false;
               }
           }
          
        }
            
        return true;
    }
}
