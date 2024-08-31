class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <3){
            return false ; 
        }
        int left = Integer.MAX_VALUE ; 
        int mid= Integer.MAX_VALUE ;

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] > left &&  nums[i] > mid ){
                return true ;
            }
            else if(nums[i] > left && nums[i] < mid){
                mid = nums[i];
            }else if(nums[i] < left ){
                left = nums[i];
            }
        }

        return false ;
    }
}