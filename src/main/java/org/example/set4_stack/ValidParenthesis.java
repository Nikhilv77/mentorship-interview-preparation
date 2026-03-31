package org.example.set4_stack;
import java.util.*;
class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if(ch == ')'){
                    if(st.peek() != '(') return false;
                }else if( ch == ']'){
                    if(st.peek() != '[') return false;
                }else{
                    if(st.peek() != '{') return false;
                }
                st.pop();
            }
        }
        if(st.size() != 0){
            return false;
        }
        return true;
    }
}