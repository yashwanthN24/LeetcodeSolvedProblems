class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ;  i<s.length(); i++){
            char ch = s.charAt(i);

            // if ch is open bracket push on to stack 
            if(ch == ')' || ch == ']' || ch == '}'){
                if(st.empty()){
                    return false ; 
                }
                char topchar = st.pop();
                if((topchar != '(' && ch == ')') || (topchar != '[' && ch == ']') || (topchar != '{' && ch ==                 '}' )){
                        return false ;
                }
            }
            else{
                st.push(ch);
            }
        }

        return st.isEmpty();
    }
}