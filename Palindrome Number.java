// https://leetcode.com/problems/palindrome-number/description/

import java.io.*;
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        for (int i =0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
