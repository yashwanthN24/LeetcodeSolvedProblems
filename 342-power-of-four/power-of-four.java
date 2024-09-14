class Solution {
    public boolean isPowerOfFour(int n) {
        // while(n > 1 && n % 4 == 0) n >>= 2;
        // return n == 1;



        if(n < 0) return false;
        int count_one = 0;
        int count_zero = 0;
        while(n!=0)
        {
            if((n & 1) == 1)    count_one++; //Counting One
            else    count_zero++;            //Counting Zero
            n = n >> 1;
        }
        if(count_one == 1 && count_zero % 2 == 0) return true;
        else return false;
    }
}