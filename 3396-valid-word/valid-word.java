class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int letter = 0;
        int digit = 1;
        int vowel = 0;
        int sp =0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               vowel++;
            }
            else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                letter++;
            } 
            else if (ch>='0'&&ch<='9') {
                digit++;
            } 
            else 
            {
                sp++;
            }
        }
        if(letter > 0 && digit > 0 && vowel>0 && sp==0){
            return true;
        }    
        return false;
        }
    }