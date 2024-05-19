class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ;  i<s.length(); i++){
            char ch = s.charAt(i);

            // if ch is close bracket 
            if(ch == ')' || ch == ']' || ch == '}'){

                // to handle case when the string is only )))))) closed brackets then stack would be empty 
                if(st.empty()){
                    return false ; 
                }
                char topchar = st.pop();
                // checking for pair () , {} , []
                if((topchar != '(' && ch == ')') || (topchar != '[' && ch == ']') || (topchar != '{' && ch ==                 '}' )){
                        return false ;
                }
            }
            else{
                // if its open bracket ( , { , [
                st.push(ch);
            }
        }
        //  we say its valid prathesis when the stack becomes empty i.e as find balanced parenthesis for all 
        return st.isEmpty();
    }
}