//https://leetcode.com/problems/buy-two-chocolates/description/

class Solution {
    public int buyChoco(int[] prices, int money) {
        int i=0,j=0,f=0;
        Arrays.sort(prices);
        for(i=0;i<prices.length;i++)
        {
            for(j=i+1;j<prices.length;j++)
            {
                if((prices[i]+prices[j])<=money)
                {
                    f=1;
                   return money-(prices[i]+prices[j]); 
                }
            }
            if(f==1)
            return 0; 
          
        }
       return money; 
}
}
