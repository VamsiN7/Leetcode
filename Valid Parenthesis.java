// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char cur = arr[i];
            if(cur =='{' || cur =='[' || cur == '('){
                stack.push(cur);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char out;
            if(cur == ')'){
                out = (char)stack.pop();
                if(out=='{' || out=='[')
                    return false;
            }
            else if(cur == ']'){
                out = (char)stack.pop();
                if(out=='{' || out=='(')
                    return false;
            }
            else if(cur == '}'){
                out = (char)stack.pop();
                if(out=='(' || out=='[')
                    return false;
            }else{
                break;
            }
        }
            return stack.isEmpty();
    }
}
