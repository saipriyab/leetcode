class Solution {
    public int countEven(int num) {
        int cnt=0,sum=0,j=0;
        String str="";
        for(int i=2;i<=num;i++)
        {
            str=String.valueOf(i);
            sum=0;
            for(j=0;j<str.length();j++)
            {
                sum=sum+Character.getNumericValue(str.charAt(j));
            }
            if(sum%2==0)
                cnt++;
        }
        return cnt;
    }
}
