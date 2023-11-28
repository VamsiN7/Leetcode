// https://leetcode.com/problems/rotate-array/description/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        // if(nums.length!=1){
        for(int i=n-k,j=n-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        for(int i=0,j=n-k-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}