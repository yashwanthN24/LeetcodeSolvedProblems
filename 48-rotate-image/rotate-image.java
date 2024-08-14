class Solution {
    public void reverse(int arr[]){
        int start = 0 , end = arr.length -1 ;
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ; 

            start++;
            end--;
        }

    }

    public void rotate(int[][] matrix) {

        int n = matrix.length;
        for(int i = 0 ; i<= n-2;  i++){
            for(int j = i+1 ; j<=n-1 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i<matrix.length ; i++){
            reverse(matrix[i]);
        }
    }
}