class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='9')
            {
                arr[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}
