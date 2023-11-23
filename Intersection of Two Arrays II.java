// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1=nums1.length;
        int n2=nums2.length;
        int m = Math.max(n1,n2);
        int k=0;
        int i=0;
        int j=0;
        int[] temp = new int[m];
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]) {
               temp[k++]=nums1[i];
                i++;j++;
            }else if(nums1[i]>nums2[j]){
                j++;               
            }else{
                i++;
            }
        }
        int[] temp2 = new int[k];
        for(int g=0;g<k;g++){
            temp2[g]=temp[g];
        }
        
        return temp2;
         }
}