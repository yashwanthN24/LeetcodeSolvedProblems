class Solution {
    public int count1s(int num){
    
        int cnt = 0 ;
        for(int i = 0 ; i<31 ; i++){
            if((num & (1<<i)) != 0){
                cnt++;
            }
        }

        return cnt;
    }
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i = 0 ; i<=n; i++){
            ans[i] = count1s(i);
        }

        return ans;
    }
}