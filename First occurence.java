// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        for(int i=0;i<hlen-nlen+1;i++){
            if(haystack.substring(i,i+nlen).equals(needle))
                return i;
        }
        return -1;
    }
}
