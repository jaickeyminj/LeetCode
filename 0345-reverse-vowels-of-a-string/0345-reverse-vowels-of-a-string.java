class Solution {
//     public String reverseVowels(String s) {
//         Set<Character> set = new HashSet<>();
//         set.add('a');
//         set.add('e');set.add('i');set.add('o');set.add('u');
//         set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        
//         Stack<Character> stack = new Stack<>();
//         StringBuilder sb,sb2;
//         sb2 = new StringBuilder();
//         for(char c:s.toCharArray()){
//             if(set.contains(c)){
//                 stack.push(c);
//             }
//         }
//         for(char c: s.toCharArray()){
//             if(set.contains(c)){
//                 sb2.append(stack.pop());
//                 continue;
//             }
//             sb2.append(c);
//         }
//         return sb2.toString();
//     }
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!set.contains(arr[left])) {
                left++;
            } else if (!set.contains(arr[right])) {
                right--;
            } else {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}