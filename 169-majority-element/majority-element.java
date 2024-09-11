class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> mp = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i] , mp.get(nums[i]) + 1 );
            }else{
                mp.put(nums[i] , 1 );
            }
        }

        for(Integer key : mp.keySet()){
            if(mp.get(key) > (nums.length /2)){
                return key;
            }
        }

        return -1 ; 
    }

    
}
