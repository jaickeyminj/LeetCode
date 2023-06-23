// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if (n < 1) {
//             return false;
//         }

//         while (n % 3 == 0) {
//             n /= 3;
//         }

//         return n == 1;
//     }
// }
public class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}