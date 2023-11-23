// https://leetcode.com/problems/integer-to-roman/description/

import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(400,"CD");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        int arr[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String ans = "";
        for(int i=arr.length-1;i>=0;i--){
            while(num>=arr[i]){
                ans=ans+map.get(arr[i]);
                num=num-arr[i];
            }
            if(num==0)
                break;
        }
        return ans;
    }
}