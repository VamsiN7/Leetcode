// https://leetcode.com/problems/find-subarrays-with-equal-sum/description/

class Solution {
    public boolean findSubarrays(int[] nums) {
        boolean flag=false;
        int n = nums.length;
        int start=0;
        int end=0;
        int sum=0;
        HashSet<Integer> set = new HashSet<>();
        while(end<n){
            sum+=nums[end];
            if(end-start+1==2){
                if(set.contains(sum)){
                    return true;
                }else{
                    set.add(sum);
                }
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return false;
    }
}