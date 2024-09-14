class Solution {
    public int bitwiseComplement(int n) {
        String original_number=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder(original_number);
        int i=0;

        while(i < original_number.length())
        {
            if(s.charAt(i)=='0')
            s.setCharAt(i, '1');

            else
            s.setCharAt(i, '0');

            i++;
        }

        String complement_number=s.toString();
        int ans=Integer.parseInt(complement_number, 2);

        return (ans);
    
    }
}