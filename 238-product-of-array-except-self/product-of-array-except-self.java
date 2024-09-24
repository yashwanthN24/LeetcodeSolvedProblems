class Solution {
    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
        int n = nums.length;

        int prefix = 1 ;

        ans[0] = 1 ;
        for(int i = 1 ; i<n ; i++){
            ans[i] = ans[i-1] * nums[i-1]; 
        }


        int suffix = 1 ;
        for(int i = n-2; i>=0 ; i--){
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }

        
        
        



        return ans;
        
    }
}