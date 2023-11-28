// https://leetcode.com/problems/unique-paths/description/

import java.util.*;
class Solution {
    //Memoization
    public int countWays(int m, int n, int[][] dp) {
        if(m==0 && n == 0)
            return 1;
        if(m<0 || n<0)
            return 0;
        if(dp[m][n]!=-1) return dp[m][n];
            
        int up = countWays(m-1,n,dp);
        int left = countWays(m,n-1,dp);
        
        return dp[m][n] = up+left;
    }

    public int uniquePaths(int m, int n){
    int dp[][]=new int[m][n];
    for (int[] row : dp)
        Arrays.fill(row, -1);
    return countWays(m-1,n-1,dp);
    }
}
    /*Tabulation
    public int countWays(int m, int n, int[][] dp) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i>0)
                    up=countWays(m-1,n,dp);
                if(j>0) 
                    left=countWays(m,n-1,dp);
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths(int m, int n){
    int dp[][]=new int[m][n];
    for (int[] row : dp)
        Arrays.fill(row, -1);
    return countWays(m,n,dp);
    }
}*/