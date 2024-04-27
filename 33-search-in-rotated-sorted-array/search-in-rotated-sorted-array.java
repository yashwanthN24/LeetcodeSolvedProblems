class Solution {
    public int search(int[] arr, int target) {
        int si = 0 , ei = arr.length-1 ; 

        while(si <= ei){
            int mid  = si + (ei - si )/2;
            
            // case when found 
            if(arr[mid] == target){
                return mid ; 
            }

            // mid on L1 
            if(arr[mid] >= arr[si]){
                // case a left of L1 
                if(arr[si] <= target && target <= arr[mid]){
                    ei = mid -1 ;
                }else{
                    // right of mid including L2 
                    si = mid + 1 ; 
                }
            }
            // case of mid on L2 
            else{
                // case of searching right of Mid on L2
                if(arr[mid ] <= target && target <= arr[ei]){
                    si = mid + 1 ; 
                }
                else {
                    // left of mid including L1 
                    ei = mid -1 ; 
                }
            }
        }
        // case when  not found 
        return -1 ; 
    }
}