// https://leetcode.com/problems/move-zeroes/description/

class Solution {
    public void moveZeroes(int[] nums) {
        int traverser=0;
        int index=0;
        int zero=0;
        while(traverser<nums.length){
            if(nums[traverser]!=0){
                nums[index]=nums[traverser];
                index++;
            }else{
                zero++;
            }
            traverser++;
        }
        while(zero>0){
            nums[index++]=0;
            zero--;
        }
    }
}