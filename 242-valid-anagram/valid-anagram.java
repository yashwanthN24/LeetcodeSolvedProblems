class Solution {
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            // System.out.println("Not a valid Anagram");
            return false;
        }

        int count[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (count[ch - 'a'] == 0) {
                // System.out.println("Not a valid Anagram ");
                return false;
            }

            count[ch - 'a']--;
        }

        // System.out.println("Valid Anagram");
        return true;
    }
}