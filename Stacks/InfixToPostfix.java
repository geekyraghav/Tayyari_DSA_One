package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String s) {
        Stack<String> st = new Stack<>();
        String ans = "";
        for(int i=0;i<s.length();i++){
            String str = "" + s.charAt(i);
            if(str.equals("(")) st.push(str);
            else if(str.equals(")")){
                while(st.size()>0 && !(st.peek()).equals("(")) ans = ans + st.pop();
                st.pop();
            }
            else if(isOperator(str)){
                while(st.size()>0 && isOperator(st.peek()) && !str.equals("^") && priority(str) <= priority(st.peek())) ans = ans + st.pop();
                st.push(str);
            }
            else ans = ans + str;
        }
        while(st.size()>0){
            ans = ans + st.pop();
        }
        return ans;
    }

    private static int priority(String s) {
        if(s.equals("^")) return 3;
        else if(s.equals("*") || s.equals("/")) return 2;
        else if(s.equals("+") || s.equals("-")) return 1;
        else return 0;
    }

    private static boolean isOperator(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^"))
            return true;
        else return false;
    }
}
