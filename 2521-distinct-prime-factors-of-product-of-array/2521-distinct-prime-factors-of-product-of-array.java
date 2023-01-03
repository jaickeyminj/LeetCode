class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)  findPrimes(num, set);
        return set.size();
    }

    private void findPrimes(int num, HashSet<Integer> set) {

        boolean foundPrime = false;
        while (num % 2 == 0) {
            num /= 2;
            foundPrime = true;
        }

        if (foundPrime) set.add(2);

        for (int i = 3; (long) i * i <= num; i += 2) {
            foundPrime = false;
            while (num % i == 0) {
                foundPrime = true;
                num /= i;
            }
            if (foundPrime) set.add(i);
        }

        if (num > 2) set.add(num);
        
    }
}