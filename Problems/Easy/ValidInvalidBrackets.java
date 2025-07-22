package dsa.Problems.Easy;

import java.util.Stack;

public class ValidInvalidBrackets {

    public static void main(String[] args) {

        /*
            Valid:
                Input: s = "[{()}]"
                Input: s = "[()()]{}"

                Invalid:
                Input: s = "([]"
                Input:  s = "([{]})"
         */

        String s = "([]";
        Stack<Character> stk = new Stack<>();
        int len = s.length();
        for(int i =0;i<len;i++) {
            char ch = s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                stk.push(ch);
            }
            if ((ch == '}' && stk.peek() == '{') || (ch == ']' && stk.peek() == '[') || (ch == ')' && stk.peek() == '(')) {
                stk.pop();
            }
        }
        if (stk.isEmpty()) {
                System.out.println("Valid Expression");
            } else {
                System.out.println("Invalid Expression");
            }
        }
}

