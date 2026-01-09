package Stacks;

import java.util.Stack;

public class PostfixToPrefix {
    static String postToPre(String s) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String str = "" + ch;
            if(isOperator(str)){
                String top = st.pop();
                String bottom = st.pop();
                String val = str + bottom + top;
                st.push(val);
            }
            else st.push(str);
        }
        return st.peek();
    }

    private static boolean isOperator(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^"))
            return true;
        else return false;
    }
}
