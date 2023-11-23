// https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int right=1;
        int left=0;
        int max=1;
        int count=1;
        while(left<nums.length){
            int i = left;
            count=1;
            while(i<nums.length-1 && nums[i]<nums[i+1]){
                i++;
                count++;
                max=Math.max(max,count);
            }
            left++;
        }
        return max;
    }
}