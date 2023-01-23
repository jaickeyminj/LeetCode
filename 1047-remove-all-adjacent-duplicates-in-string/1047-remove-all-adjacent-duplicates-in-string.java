class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack= new Stack<>(); 
        for(char ch: s.toCharArray()) {
            stack.push(ch);
            while (stack.size() > 1) {
                    char top1= stack.pop();
                    if (stack.peek() == top1) 
                        stack.pop();
                    else {
                        stack.push(top1);
                        break;
                    }
                }
        
        }
        return stack.isEmpty()? "" : stack.toString().replaceAll("(\\[|\\]|\\,|\\s+)", "");
    }
}