class Solution {
    public char findTheDifference(String s, String t) {

        // Approach 1 

          int xor = 0;

        // XOR all characters in string s
        for (int i = 0; i < s.length(); i++) {
            xor ^= s.charAt(i);
        }

        // XOR all characters in string t
        for (int i = 0; i < t.length(); i++) {
            xor ^= t.charAt(i);
        }

        // The remaining value in xor will be the ASCII value of the extra character
        return (char) xor;


        // Approach 2 


        /*

        // Initialize sum variables for both strings
        int sumS = 0, sumT = 0;

        // Calculate the sum of ASCII values of characters in string s
        for (int i = 0; i < s.length(); i++) {
            sumS += (int) s.charAt(i);
        }

        // Calculate the sum of ASCII values of characters in string t
        for (int i = 0; i < t.length(); i++) {
            sumT += (int) t.charAt(i);
        }

        // The difference in sums will give the ASCII value of the extra character
        return (char) (sumT - sumS);





        */


        // Approach 3

        /*

        int[] charCount = new int[26]; // 26 letters in the alphabet


        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }


        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charCount[c - 'a']--;


            if (charCount[c - 'a'] < 0) {
                return c;
            }
        }

        // This point should never be reached due to constraints
        return ' ';
    }
}
*/


    }
}