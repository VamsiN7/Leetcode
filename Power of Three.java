// https://leetcode.com/problems/power-of-three/description/

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        int x = n/3;
        if(n>1){
            return n%3==0 && isPowerOfThree(x);
        }else{
        return false;}
    }
}
