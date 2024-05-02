class Solution {
    public int maxArea(int[] height) {
        int maxstoredwater = 0;// when no container can be formed that is single line case waterstored = 0 

        int lp = 0; // left pointer pointing to first line 
        int rp = height.length - 1; // right pointer pointing to last line 
        
        // we make a container consider lp and rp as the left and right boundaries 

        // we make sure lp != rp or lp > rp as we deal with single line or duplicate container again respectively 
        
        while (lp < rp) {

            //  find width and height of the container 
            // width = index of l2 - index of l1
            int width = rp - lp;

            // height = min(l1 height , l2 height )

            int heiht = Math.min(height[lp], height[rp]);

            // calculate current container stored water area = width * height 
            int curwaterstored = width * heiht;

            // check if its the max stored water and store it in maxstoredwater 

            maxstoredwater = Math.max(maxstoredwater, curwaterstored);

            // move the pointer having smaller height to get maximum size container and hence maximum water 
            if (height[lp] < height[rp]) {
                // lp pointer height is smaller  so move forward to get a bigger container
                lp++;
            } else {
                // i.e rp height is smaller so move rp forward i.e rp-- to get big container 
                rp--;

            }

        }
        
        return maxstoredwater;// return the maxwaterstored 
    }
}