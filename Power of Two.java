// https://leetcode.com/problems/power-of-two/description/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        if(n==1)
            return true;
        if(n>1)
            return n%2==0 && isPowerOfTwo(n/2);
        else
            return false;
    }
}
