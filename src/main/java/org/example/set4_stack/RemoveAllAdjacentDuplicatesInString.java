package org.example.set4_stack;
import java.util.*;

public class RemoveAllAdjacentDuplicatesInString {
        public String removeDuplicates(String s) {
            Stack<Character> st = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()){
                if(!st.isEmpty() && st.peek() == ch){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            sb.reverse();
            return sb.toString();
        }
}
