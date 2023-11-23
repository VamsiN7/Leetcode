// https://leetcode.com/problems/first-unique-character-in-a-string/description/

import java.util.ArrayList;

class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> arr = new ArrayList<Character>();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            arr.add(ch[i]);
        }
        for(int j=0;j<ch.length;j++){
            if(arr.indexOf(ch[j])==arr.lastIndexOf(ch[j])){
                return j;
            }
        }
     return -1;
    }
}