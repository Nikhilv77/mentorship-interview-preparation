package org.example.set4_stack;
import java.util.*;
class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int previous = st.peek();
                st.push(previous * 2);
            }else if(s.equals("+")){
                int last = st.pop();
                int prevLast = st.peek();
                st.push(last);
                st.push(last + prevLast);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(st.size() > 0){
            sum += st.pop();
        }
        return sum;
    }
}