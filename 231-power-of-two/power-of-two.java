class Solution {
    public boolean isPowerOfTwo(int n) {

        // All negative numbers wont work powerofTwo
        if(n <= 0){
            return false ; 
        }
        return (n & n-1) == 0;
    }
}