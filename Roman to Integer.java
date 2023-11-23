// https://leetcode.com/problems/roman-to-integer/submissions/792733853/

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++){
            int cur = hash.get(s.charAt(i));
            if(i<s.length()-1 && cur<hash.get(s.charAt(i+1)))
                res-=cur;
            else
                res+=cur;
    }
        return res;
    }}
