//https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/description/

class Solution {
    public int largestInteger(int num) {
        String str=String.valueOf(num),result="";
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int i=0,j=0,k=0,number=0;
        for(i=0;i<str.length();i++)
        {
            number=Character.getNumericValue(str.charAt(i));
            if(number%2==0)
            even.add(number);
            else
            odd.add(number);
        }
        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());
         for(i=0;i<str.length();i++)
        {
             number=Character.getNumericValue(str.charAt(i));
            if(number%2==0)
            {
               result=result+even.get(j);
               j++;
            }
            else
            {
               result=result+odd.get(k);
               k++;
            }
        }
        return Integer.parseInt(result);
    }
}
