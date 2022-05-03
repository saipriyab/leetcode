class Solution {
    public int divide(int dividend, int divisor) {
       //  System.out.println("max val---"+Integer.MAX_VALUE);
      if(dividend== Integer.MIN_VALUE && divisor==-1)
      {
         
return Integer.MAX_VALUE;
      }
        return (dividend)/(divisor);
    }
}
