class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb,sb2;
        // sb = new StringBuilder();
        sb2 = new StringBuilder();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                stack.push(c);
            }
            // sb.append(c);
        }
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                sb2.append(stack.pop());
                continue;
            }
            sb2.append(c);
        }
        return sb2.toString();
    }
}