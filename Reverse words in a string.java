// https://leetcode.com/problems/reverse-words-in-a-string/description/

class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] str = s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].isEmpty()){
            res=res+str[i]+" ";
           }
           }
        return res.trim();
    }
}