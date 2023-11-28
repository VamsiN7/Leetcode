// https://leetcode.com/problems/house-robber/description/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp =new int[n];
        Arrays.fill(dp,-1);
        return util(dp,nums,n-1);
    }
    
    public static int util(int[] dp, int[] nums, int ind){
        if(ind<0) return 0;
        if(ind==0) return nums[ind];
        if(dp[ind]!=-1) return dp[ind];
        int pick = nums[ind] + util(dp,nums,ind-2);
        int dontPick = 0 + util(dp,nums,ind-1);
        
        return dp[ind]=Math.max(pick,dontPick);
    }
}