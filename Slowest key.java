// https://leetcode.com/problems/slowest-key/description/

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max=0;
        int i=0;
        int j=0;
        Map<Character,Integer> map = new HashMap<>();
        for(;i<releaseTimes.length-1;i++){
            int curr=releaseTimes[i+1]-releaseTimes[i];
            if(curr>max){
                j=i+1;
                max=curr;
            }
            if(curr==max && keysPressed.charAt(i+1)>keysPressed.charAt(j)){
                j=i+1;
            }
        }
        if(releaseTimes[0]>max){
            return keysPressed.charAt(0);
        }
        if(releaseTimes[0]==max){
            if(keysPressed.charAt(0)>keysPressed.charAt(j)){
                return keysPressed.charAt(0);
            }
        }
        return keysPressed.charAt(j);
    }
} 