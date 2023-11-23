// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ls = new LinkedList<String>();
        if(digits.length()==0)
             return ls;
        ls.add(""); 
        String[] char1 = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(ls.peek().length()==i){
                String p= ls.remove();
                for(char c : char1[index].toCharArray()){
                    ls.add(p+c);
                }
                 
            }
        }
        return ls;
    }
}