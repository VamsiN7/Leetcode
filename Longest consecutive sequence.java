// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // int count =0;
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        
        // for(int i=0;i<nums.length;i++){
        //     if(!set.contains(nums[i]-1)){
        //         int j = nums[i];
        //         while(set.contains(j))
        //             j++;
        //         if(count<j-nums[i])
        //             count=j-nums[i];
        //     }
        // }
        // return count;
        Arrays.sort(nums);
        int max=1;
        int count=1;
        if(nums.length<1)
            return 0;
        if(nums.length==1)
            return 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1)
                count++;
            else if(nums[i+1]-nums[i]==0)
                continue;
            else
                count=1;
            max=Math.max(max,count);
        }
        return max;
    }
}