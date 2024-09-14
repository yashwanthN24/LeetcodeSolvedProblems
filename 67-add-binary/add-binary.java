import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        return (new BigInteger(a,2).add(new BigInteger(b,2))).toString(2);
    }
}

// BigInteger can handle numbers in base 2 , 8 and 10 

// new BigInteger(a , 2 ) creates decimal of a 
