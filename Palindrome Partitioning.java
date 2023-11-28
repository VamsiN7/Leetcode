// https://leetcode.com/problems/palindrome-partitioning/description/

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        Util(0,s,temp, ans);
        return ans;
    }

    public static void Util (int ind, String s, List<String> temp, List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=ind; i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                temp.add(s.substring(ind,i+1));
                Util(i+1,s,temp,ans);
                temp.remove(temp.size()-1);   
            }
        }
    }

    public static boolean isPalindrome(String s, int right,int left){
        while(right<=left){
            if(s.charAt(right++)!=s.charAt(left--)){
                return false;
            }
        }
        return true;
    }
}