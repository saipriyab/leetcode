class Solution {
    public boolean checkPerfectNumber(int num) {
        int cnt=0;
        int max=num/2;
        for(int i=1;i<=max;i++)
        {
            if(num%i==0)
                cnt=cnt+i;
        }
            return cnt==num;

    }
}
