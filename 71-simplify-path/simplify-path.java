class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        StringBuilder result = new StringBuilder("");

        String directorynamesorOper[] = path.split("/");

        for(String dir : directorynamesorOper){
            if(dir.equals("..") && !st.isEmpty() ){
                st.pop();
            }else if(!dir.equals("") && !dir.equals(".") && !dir.equals("..") ){
                st.push(dir);
            }
        }

        if(st.isEmpty()){
            return "/";
        }

        while(!st.isEmpty()){
            result.insert(0 , st.pop()).insert(0 , '/');
        }


        return result.toString();

    }
}