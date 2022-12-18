//url: https://leetcode.com/problems/evaluate-reverse-polish-notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int a=0,b=0;
        for(String str:tokens)
        {
            if(str.equals("+"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a+b);
            }
             else if(str.equals("-"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a-b);
            }
            else if(str.equals("*"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(b*a);
            }
             else if(str.equals("/"))
            {
                b=stack.pop();
                a=stack.pop();
                stack.push(a/b);
            }
            else
            {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.get(0);
    }
}
