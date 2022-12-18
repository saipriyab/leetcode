//url: https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        int cnt=0,i=0,j=0,f=0;
        for(;i<temperatures.length;i++)
        {
            cnt=0;f=0;
            for(j=i+1;j<temperatures.length;j++)
            {
                  if(temperatures[j]>temperatures[i])
                  {
                      f=1;
                      cnt++;
                      break;
                  }
                  else
                  {
                      cnt++;
                  }
            }
            if(f>0)
            res[i]=cnt;
            else
            res[i]=0;
        }
        return res;
    }
}
