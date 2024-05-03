class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        help(nums,new ArrayList<>());
        return l;
    }
    void help(int[] n,List<Integer> ll){
        if(ll.size()==n.length){
            l.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<n.length;i++){
            if(!ll.contains(n[i])){
            ll.add(n[i]);
            help(n,ll);
            ll.remove(ll.size()-1);

            }
        }
    }
}