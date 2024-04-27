class Solution {
    public int trap(int[] height) {
        int n = height.length ; 
        // calculate left max boundary or height of bar using leftmax auxillary(helper) Array
        
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1 ; i<n ; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }

        // calculate right max boundart or height of bar using auxillary(helper) array rightmax 

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n -2 ; i>= 0 ; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }

        int trappedwater = 0 ; 

        // iterate through each bar  to calculate water level and finally find the trapped water for each bar and adding them as a running sum 
        for(int i = 0 ; i<n ; i++){

            // waterlevel = min(leftmax of currentbar , rightmax of current bar)
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);

            // trappedwater = waterlevel of current bar - height of current  bar 
            trappedwater += waterlevel - height[i];
        }

        return trappedwater; 
    }

}