// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
      int start =0;
        int end = nums.length-1;
        int first=-1;
        int last=-1;
            
        // For the first position of the element'
        
        while ( start <= end ){
            int mid = start + ( end -start )/2;
            if (target == nums [mid]){
                first=mid;
                end =mid-1;
            }
            else if ( target > nums[mid])
                start = mid+1;
            else 
                end = mid -1;
        }
        
        // For the last position of the element
        
        start =0;
        end =nums.length-1;  
        while ( start <= end ){
            int mid = start + ( end -start )/2;
            if (nums [mid] == target ){
                last=mid;
                start =mid+1;
            }
            else if ( nums [mid] > target)
                end = mid -1;
            else if (nums[mid] < target )
                start = mid + 1;
        }
        return new int [] {first,last};
    }
}