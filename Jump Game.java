// https://leetcode.com/problems/jump-game/description/

class Solution {
   /* public boolean canJump(int[] nums) {
        int ind=0;
        if(nums.length==1) return true;
        if(nums[0]==0 || nums[nums.length-1]==0)
            return false;
        else
            return rec(ind,nums);
    }

    public boolean rec(int ind, int[] nums){
        boolean flag = false;
        if(ind>=nums.length-1)
            return true;
        int jump = nums[ind];
        for(int i=1;i<=jump;i++)
            flag = rec(ind+i,nums);
        return flag;
    }*/
    public boolean canJump(int[] nums) {
        int dest = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=dest){
                dest=i;
            }
        }
        return dest==0;
    }

}