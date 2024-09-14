class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totsum = (n*(n+1)) >> 1;
        int ans =0;
        for(int i = 0 ; i<nums.length ; i++){
            ans += nums[i];
        }

        return totsum - ans ; 
    }
}