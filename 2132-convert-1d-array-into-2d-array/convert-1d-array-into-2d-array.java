class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        // we are given with m rows and n columns so a 2D array contains m * n  elements in them 

        //  so we have to fill m*n elements using elements of orginal 1D array
        if(m*n != original.length){
            // not possible case
            return new int[][]{};
        }
        int twoD[][] = new int[m][n];

        // start filling elements directly 

        // when we imagine 2D array as a linear array we can get the index of each row using (i/n) and each column using (i%n)

        
        for(int i = 0 ; i<original.length ; i++){
            twoD[i/n][i%n] = original[i];
        }

        return twoD;
    }
}