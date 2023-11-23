// https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
       String s1 = s.toLowerCase();
       String s2 = s1.replaceAll("[^A-Za-z0-9]","");
       int len=s2.length();
        for(int i=0;i<len/2;i++){
            if(s2.charAt(i)!=s2.charAt(len-i-1))
                return false;
        }
    return true;
    }
}
