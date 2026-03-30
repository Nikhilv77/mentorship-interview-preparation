package org.example.set3_hashing;
import java.util.*;

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) != 1){
                continue;
            }
            return i;
        }
        return -1;
    }
}