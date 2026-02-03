import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger numss1 = new BigInteger(num1);
        BigInteger numss2 = new BigInteger(num2);
        BigInteger result = numss1.add(numss2);
        String result_1 = String.valueOf(result);
        return result_1;
    }
}