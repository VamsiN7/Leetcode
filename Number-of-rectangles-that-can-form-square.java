// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/description/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int min =0;
        int maxVal =0;
        int maxKey=0;
        int j=0;
        int temp=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            min=Math.min(rectangles[i][0],rectangles[i][1]);
            if(!map.containsKey(min)){
                map.put(min,1);
            }else{
                map.put(min,map.get(min)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
             int key = entry.getKey();          
             maxKey = Math.max(key,maxKey); 
        }
        maxVal=map.get(maxKey);
        return maxVal;
    }
}