class Solution {
    public int numberOfMatches(int n) {
        int cnt=0,num=0;
        while(n>1)
        {
            if(n%2==0)
            {
               num=n/2;
                n=num;
            }
            else
            {
                num=(n-1)/2;
                n=num+1;
            }
            cnt=cnt+num;
        }
        return cnt;
    }
}

leetcode url: https://leetcode.com/problems/count-of-matches-in-tournament/
