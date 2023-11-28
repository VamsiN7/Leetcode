// https://leetcode.com/problems/edit-distance/description/

class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        return Util(word1,word2,m,n);
    }
    public int Util(String s1, String s2, int m, int n){
        int[][] dp = new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<=m;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 0 + dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1],dp[i-1][j]));
                }
            }
        }
        return dp[m][n];
    }
}