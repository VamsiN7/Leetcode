// https://leetcode.com/problems/length-of-last-word/description/

class Solution {
    public int lengthOfLastWord(String s) {
     String[] arr = s.split(" ");
     String str = arr[arr.length-1];
     return str.length();
    }
}
