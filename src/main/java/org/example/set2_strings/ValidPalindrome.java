package org.example.set2_strings;

// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (Character.isLetterOrDigit(ch)) {
//                 sb.append(Character.toLowerCase(ch));
//             }
//         }
//         int left = 0;
//         int right = sb.length() - 1;
//         while (left <= right) {
//             char leftChar = sb.charAt(left);
//             char rightChar = sb.charAt(right);
//             if (leftChar != rightChar) {
//                 return false;
//             } else {
//                 left++;
//                 right--;
//                 continue;
//             }
//         }
//         return true;
//     }
// }
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char chLeft = s.charAt(left);
            char chRight = s.charAt(right);
            if(!Character.isLetterOrDigit(chLeft)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(chRight)){
                right--;
                continue;
            }
            if(Character.toLowerCase(chLeft) != Character.toLowerCase(chRight)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}