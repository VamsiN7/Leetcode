// https://leetcode.com/problems/license-key-formatting/description/

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        s=s.toUpperCase();
        s=s.replaceAll("-","");
        int n = s.length();
        for(int i=n-1,count=0;i>=0;i--){
            if(count==k){
                sb.append('-');
                count=0;
            }
            sb.append(s.charAt(i));
            count++;
        }
        return sb.reverse().toString();
    }
}