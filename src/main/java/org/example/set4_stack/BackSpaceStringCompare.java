package org.example.set4_stack;
import java.util.*;
public class BackSpaceStringCompare {
        public boolean backspaceCompare(String s, String t) {
            Stack<Character> sst = new Stack<>();
            Stack<Character> tst = new Stack<>();
            for(char ch : s.toCharArray()){
                if(ch == '#'){
                    if(!sst.isEmpty())sst.pop();
                }else{
                    sst.push(ch);
                }
            }
            for(char ch : t.toCharArray()){
                if(ch == '#'){
                    if(!tst.isEmpty())tst.pop();
                }else{
                    tst.push(ch);
                }
            }
            if(sst.size() != tst.size()) return false;
            while(!sst.isEmpty()){
                if(sst.pop() != tst.pop()) return false;
            }
            return true;
        }
}
