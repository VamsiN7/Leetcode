// https://leetcode.com/problems/subsets/description/

import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        util(0,new ArrayList<>(),nums,ans);
        return ans;
    }

    public static void util(int ind, List<Integer> temp, int[] nums, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            temp.add(nums[i]);
            util(i+1,temp,nums,ans);
            temp.remove(temp.size()-1);
        }
    }
}