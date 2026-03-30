package org.example.set3_hashing;

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i = 0; i<ransomNote.length(); i++){
//             char ch = ransomNote.charAt(i);
//             if(map.containsKey(ch)){
//                 map.put(ch,map.get(ch)+1);
//             }else{
//                 map.put(ch,1);
//             }
//         }
//         for(int i = 0; i<magazine.length(); i++){
//             char ch = magazine.charAt(i);
//             if(map.containsKey(ch)){
//                map.put(ch,map.get(ch)-1);
//             }
//         }
//         for(char ch : map.keySet()){
//             if(map.get(ch) > 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char ch : magazine.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(freq[ch-'a']==0){
                return false;
            }
            freq[ch-'a']--;
        }
        return true;
    }
}