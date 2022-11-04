url: https://leetcode.com/problems/reverse-vowels-of-a-string/
class Solution {
    public String reverseVowels(String s) {
        String vowels=s.replaceAll("[^aeiouAEIOU]","");
        int j=vowels.length()-1;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
              arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
            {
                if(j>=0)
                {
                    arr[i]=vowels.charAt(j);
                    j--;
                }
            }
        }
                                   return new String(arr);
    }
}
