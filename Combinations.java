// https://leetcode.com/problems/combinations/description/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Util(1,n,k,temp,res);
        return res;
    }
    private void Util(int index, int n, int k,List<Integer> temp, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=index;i<=n;i++){
            temp.add(i);
            Util(i+1,n,k-1,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}