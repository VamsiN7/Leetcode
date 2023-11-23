// https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    //By using dynamic progg it looks like
   /* public int fib(int n, int[] dp) {
        if(n<=1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]= fib(n-1,dp)+fib(n-2,dp);
    }
    int() main{
        int n;
        int[n+1] dp = new int[];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        int fibonacci = fib(n,dp);
    }*/
}