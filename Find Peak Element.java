// https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        // int start = 0 , end = nums.length-1;
        // int mid ;
        // while(start<end){
        //     mid = (start+end)/2;
        //     if(nums[mid]>nums[mid+1]){
        //         end = mid;
        //     }else{
        //         start = mid +1 ;
        //     }
        // }
        // return start;
        int n=nums.length;
        if (n == 1)
            return 0;
        if (nums[0] >= nums[1])
            return 0;
        if (nums[n - 1] >= nums[n - 2])
            return n - 1;
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1])
                return i;
        }
        return 0;
    }
}