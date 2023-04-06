// class Solution {
//     public int minNumber(int[] nums1, int[] nums2) {
//         Set<Integer> s1 = getHashSet(nums1), s2 = getHashSet(nums2);
//         s1.retainAll(s2);
//         if (!s1.isEmpty()) {
//             return s1.stream().mapToInt(i -> i).min().getAsInt();
//         }
//         int a = IntStream.of(nums1).min().getAsInt();
//         int b = IntStream.of(nums2).min().getAsInt();
//         return Math.min(a, b) * 10 + Math.max(a, b);
//     }
//     private HashSet<Integer> getHashSet(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) {
//             set.add(num);
//         }
//         return set;
//     }
// }
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int minA=10; 
        int minB=10; 
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i=0; i<nums1.length; i++) {
            a[nums1[i]]=1;
        } 

        for (int i=0; i<nums2.length; i++) {
            b[nums2[i]]=1;
        }
        
        for (int i=1; i<=9; i++) {
            if (a[i]==1 && b[i]==1) return i;
        }
    
        for (int i=1; i<=9 && minA==10; i++) {
            if (a[i]==1) minA=i;
        }

        for (int i=1; i<=9 && minB==10; i++) {
            if (b[i]==1) minB=i;
        }

        if (minA<=minB) return minA*10+minB;
        else return minA+minB*10;
    }
}