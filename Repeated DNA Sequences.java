// https://leetcode.com/problems/repeated-dna-sequences/description/

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length()-9;i++){
            if(!map.containsKey(s.substring(i,i+10))){
                map.put(s.substring(i,i+10),1);
            }else{
                map.put(s.substring(i,i+10),map.get(s.substring(i,i+10))+1);
            }
        }
        for(String i:map.keySet()){
            if(map.get(i)>1){
                res.add(i);
            }
        }
        return res;
    }
}