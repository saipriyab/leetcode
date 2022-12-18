//url: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses

lass Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack();
        int i=0,j=0;
        for(;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                String str="";
                char val=stack.pop();
                 while(!stack.isEmpty())
                 {
                    
                     if(val=='(')
                     break;
                     else
                     str=str+val;
                      val=stack.pop();
                 }
                 for(j=0;j<str.length();j++)
                 stack.push(str.charAt(j));
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder res=new StringBuilder();
       for(Character str:stack)
        {
            res.append(str);
        }
      
        return res.toString();
    }
}
