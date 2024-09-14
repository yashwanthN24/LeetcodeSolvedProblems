import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // return (new BigInteger(a,2).add(new BigInteger(b,2))).toString(2);


        // or  APproach 2

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
        if(i >= 0) carry += a.charAt(i--) - '0';
        if(j >= 0) carry += b.charAt(j--) - '0';
        sb.append(carry % 2);
        carry /= 2;
        }
        return sb.reverse().toString();
    }
}

// BigInteger can handle numbers in base 2 , 8 and 10 

// new BigInteger(a , 2 ) creates decimal of a 

// toString(2) converts the decimal sum into binary string i.e base 2 
