class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer>set=new HashSet();
        for(int i:nums){
            if(set.contains(i)){ // or if(!set.add(i)){return i;} no need else now thats it 
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    } 
    
}