// https://leetcode.com/problems/shuffle-the-array/description/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        
        int start = 0;
        int mid = n;

        int temp[]= new int[m];

        for(int i=0; i<m; i++)
        {
            if(i%2 == 0){
            temp[i]=nums[start];
            start++;
            }else{
            temp[i]=nums[mid];
            mid++;    
            }

        }
        
        return temp;
    }
}