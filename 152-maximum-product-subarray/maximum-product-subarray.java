class Solution {
    public int maxProduct(int[] nums) {
        long maxproduct = Integer.MIN_VALUE;
        
        for(int start  = 0 ; start < nums.length ; start++){
            long curproduct = 1;
            for(int end = start ; end<nums.length;end++){

                    
                curproduct *=nums[end];
                
                if (curproduct > Integer.MAX_VALUE){
                curproduct =1 ;
                }
                 maxproduct = Math.max(curproduct , maxproduct);


              
            }

            
           


        }

        return (int) maxproduct ;
    }
}