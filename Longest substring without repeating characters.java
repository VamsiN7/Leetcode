// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
     int len = s.length();
     int a =0;
     int i=0;
     int res=0;
     HashSet<Character> set = new HashSet();
     while(i<len){
         if(!set.contains(s.charAt(i))){
             set.add(s.charAt(i));      
             i++;
             res = Math.max(set.size(),res);
         }else{
             set.remove(s.charAt(a));
             a++;
         }
     }
     return res;
    }
}