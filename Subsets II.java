// https://leetcode.com/problems/subsets-ii/description/

import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ans); 
        return ans;
    }

    public static void findSubsets(int ind, int[] nums, List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp)); 
        for(int i = ind;i<nums.length;i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            temp.add(nums[i]); 
            findSubsets(i+1, nums, temp, ans); 
            temp.remove(temp.size() - 1);
    }
    }
}