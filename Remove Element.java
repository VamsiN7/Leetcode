// https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
      int len = nums.length;
      int j=0;
      for(int i=0;i<len;i++){
          if(nums[i]!=val){
              nums[j]=nums[i];
              j++;
          }
      }
      return j;
      
    }
}