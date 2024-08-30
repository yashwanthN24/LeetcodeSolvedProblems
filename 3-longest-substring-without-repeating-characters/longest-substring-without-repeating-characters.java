class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();

        int max = 0 , left = 0 , right = 0 ;

        while(right <= s.length()-1){
            if(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }else{
                st.add(s.charAt(right));
                max = Math.max(max , right - left + 1 );
                right++;
            }
        }

        return max;
    }
}