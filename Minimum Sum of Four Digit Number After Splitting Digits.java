class Solution {
    public int minimumSum(int num) {
        String str=String.valueOf(num);
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        String str1="";
        str1=str1+arr[0];
        str1=str1+arr[3];
        String str2="";
        str2=str2+arr[1];
        str2=str2+arr[2];
        return Integer.parseInt(str1)+Integer.parseInt(str2);
    }
}
