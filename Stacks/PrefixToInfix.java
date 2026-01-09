package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    static String preToInfix(String s) {
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            String str = "" + ch;
            if(isOperator(str)){
                String top = st.pop();
                String bottom = st.pop();
                String val = "(" + top + str + bottom + ")";
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
