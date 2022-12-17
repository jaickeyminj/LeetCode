class Solution {
    public int minAddToMakeValid(String s) {
        int left=0, right=0;
        for(int i=0;i<s.length();i++) {
            char curr = s.charAt(i);
            if (curr == '(')
                left++;
            else if(curr == ')')
                if(left > 0)
                    left--;
                else
                    right++;
        }
        return left+right;
    }
}