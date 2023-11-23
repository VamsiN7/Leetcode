// https://leetcode.com/problems/3sum/description/

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> hash = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    hash.add(temp);
                    left++;
                    right--;
                }else if (sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        for(List<Integer> i : hash)
            res.add(i);
        return res;
    }
}