// https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int[] arr = new int[nums.length];
        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                arr[index] = nums[left]*nums[left];
                left++;
            }else{
                arr[index] = nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return arr;
    }
}