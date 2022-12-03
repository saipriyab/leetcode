leetcode url: https://leetcode.com/problems/determine-if-string-halves-are-alike/

/*Approach*/
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

