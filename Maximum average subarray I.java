// https://leetcode.com/problems/maximum-average-subarray-i/description/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
           sum+=nums[i];
        }
        int max = sum;
        for(int i=k;i<nums.length;i++){
            //add next element
            sum = sum+nums[i];
            //remove first element from previous window
            sum = sum-nums[i-k];
            max = Math.max(max,sum);
        }
        // multiply with 1.0 to convert it into double val
        return (max*1.0)/k;
    }
}