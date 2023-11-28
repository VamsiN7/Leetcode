// https://leetcode.com/problems/permutations-ii/description/

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        util(0,nums,res);
        return new ArrayList(res);
    }

    private void util(int index, int[] nums, Set<List<Integer>> res){
        if(index==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            res.add(temp);
            return ;
        }
        for(int i=index;i<nums.length;i++){
           // if(i>index && nums[i]==nums[index]) continue;
            swap(i, index, nums);
            util(index+1,nums,res);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums){
        int k = nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
}