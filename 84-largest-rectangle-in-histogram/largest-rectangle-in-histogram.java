class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0 ; 
        int nextSmallerRight[] = new int[heights.length];
        int nextSmallerLeft[] = new int[heights.length];

        // nextSmallerRight 
        Stack<Integer> st = new Stack<>();

        for(int i = heights.length - 1 ; i>=0 ; i--){

            while(!st.empty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.isEmpty()){
                // -1 here in this case n - arr.length
                nextSmallerRight[i] = heights.length;
            }else{
                // top
                nextSmallerRight[i] = st.peek();
            }
            st.push(i);
        }

        // nextSmallerLeft

        st = new Stack<>();

        for(int i = 0 ; i<heights.length ; i++){
            while(!st.empty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nextSmallerLeft[i] = -1 ; 
            }else{
                nextSmallerLeft[i] = st.peek();
            }
            st.push(i);
        }
     

        
        // current Area 
        // width = j - i - 1 i.e nsr[i] - nsl[i] - 1 
        for(int i = 0 ; i<heights.length ; i++){
            int height = heights[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1 ; 
            int curArea = width * height ; 
            maxArea = Math.max(maxArea , curArea );
        }

        return maxArea;


    }
}