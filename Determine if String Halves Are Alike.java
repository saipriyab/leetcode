leetcode url: https://leetcode.com/problems/determine-if-string-halves-are-alike/

/**Approach 1**/
class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int mid=s.length()/2;
        String a=s.substring(0,mid);
        String b=s.substring(mid);
        a=a.replaceAll("[^aeiou]","");
        b=b.replaceAll("[^aeiou]","");
        return a.length()==b.length();
    }
}

/**Approach 2**/
class Solution {
    public boolean halvesAreAlike(String s) {
       Set<Character> vowels=Set.of('a','e','i','o','u','A','E','I','O','U');
        int cnt=0,mid=s.length()/2;
        char a='0',b='0';
        for(int i=0;i<s.length()/2;i++)
        {
           a=s.charAt(i);
           b=s.charAt(mid+i);
            if(vowels.contains(a))
                cnt++;
            if(vowels.contains(b))
               cnt--;
        }
        return cnt==0;
    }
}
