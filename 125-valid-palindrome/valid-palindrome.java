class Solution {
    public boolean isPalindrome(String s) {
        

        StringBuilder s1 = new StringBuilder("");

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                s1.append(Character.toLowerCase(ch));
            }else if((ch >= 'a' && ch <= 'z' )|| (ch >='0' && ch<='9')){
                s1.append(ch);
            }
        }

        s = s1.toString();

        int start = 0 , end = s.length()-1 ;

        while(start < end ){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}