url: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

//Approach 1
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        for(String w1:word1)
            str1=str1+w1;
        for(String w2:word2)
            str2=str2+w2;
        return str1.equals(str2);
    }
}

//Approach 2
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        for(String w1:word1)
            str1=str1+w1;
        for(String w2:word2)
            str2=str2+w2;
        return str1.equals(str2);
    }
}
