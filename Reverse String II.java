class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        int start=0,end=0;
        char temp='0';
        for(int i=0;i<arr.length;i=i+(2*k))
        {
            start=i;
            end=Math.min(i+k,arr.length)-1;
            while(start<end)
            {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}

leetcodeurl: https://leetcode.com/submissions/detail/702858352/
