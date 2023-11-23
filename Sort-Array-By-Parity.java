// https://leetcode.com/problems/sort-array-by-parity/description/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int start = 0;
    int end = n - 1;

    for (int i = 0; i < n; i++) {
        if (nums[i] % 2 == 0) {
            res[start] = nums[i];
            start++;
        } else {
            res[end] = nums[i];
            end--;
        }
    }
        return res;
    }
}