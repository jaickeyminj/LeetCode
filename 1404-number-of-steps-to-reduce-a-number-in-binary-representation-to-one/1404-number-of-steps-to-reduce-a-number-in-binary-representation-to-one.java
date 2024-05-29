import java.math.BigInteger;

public class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2); // Convert binary string to BigInteger
        int steps = 0;

        // Loop until num is reduced to 1
        while (!num.equals(BigInteger.ONE)) {
            if (num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                num = num.shiftRight(1); // If even, divide by 2
            } else {
                num = num.add(BigInteger.ONE); // If odd, add 1
            }
            steps++;
        }

        return steps;
    }
}