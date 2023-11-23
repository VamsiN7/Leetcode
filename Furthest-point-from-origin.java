// https://leetcode.com/problems/furthest-point-from-origin/description/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int Lcur=0;
        int Rcur=0;
        int us=0;
        int max=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L')
                Lcur++;
            else if(moves.charAt(i)=='R')
                Rcur++;
            else 
                us++;
        }
        return Math.abs(Lcur-Rcur)+us;
    }
}