// https://leetcode.com/problems/combination-sum-ii/description/

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        util(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }

    public static void util(int ind, int[] candidates, int target, List<Integer> temp, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = ind; i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            util(i+1,candidates,target-candidates[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}