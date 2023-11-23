// https://leetcode.com/problems/longest-common-prefix/description/

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        Arrays.sort(strs);
        int len = strs[0].length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
        }
    }