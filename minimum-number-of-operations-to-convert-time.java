//url: https://leetcode.com/problems/minimum-number-of-operations-to-convert-time

class Solution {
    public int convertTime(String current, String correct) {
        int currentTime=(Integer.parseInt(current.substring(0,2))*60)+Integer.parseInt(current.substring(3));
         int correctTime=(Integer.parseInt(correct.substring(0,2))*60)+Integer.parseInt(correct.substring(3));
         int diff=correctTime-currentTime,cnt=0;
         while(diff>0)
         {
             if((diff-60)>=0)
             {
                 diff=diff-60;
                 cnt++;
             }
              else if((diff-15)>=0)
             {
                 diff=diff-15;
                 cnt++;
             }
               else if((diff-5)>=0)
             {
                 diff=diff-5;
                 cnt++;
             }
              else if((diff-1)>=0)
             {
                 diff=diff-1;
                 cnt++;
             }
            
         }
         return cnt;
    }
}
