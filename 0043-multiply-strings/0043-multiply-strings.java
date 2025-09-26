import java.math.*;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger num11=new BigInteger(num1);
        BigInteger num22=new BigInteger(num2);
        BigInteger num3=num11.multiply(num22);
       
        return String.valueOf(num3);
        
    }
}