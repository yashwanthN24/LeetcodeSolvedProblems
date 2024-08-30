class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int mergedArray[] = new int[num1.length + num2.length];

        int k = 0 ;
        for(int i= 0 ; i<num1.length ; i++){
            mergedArray[k++] = num1[i];
        }

        for(int i = 0 ; i<num2.length ; i++){
            mergedArray[k++] = num2[i];
        }

        int n = mergedArray.length;
        Arrays.sort(mergedArray);
        if( n % 2 == 0){
            return (mergedArray[n/2 -1 ] + mergedArray[n/2])/2.0;
        }else{
            return mergedArray[n/2];
        }
    }
}