class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String b= a.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder ab = new StringBuilder(b);
        ab.reverse();
        if(b.equals(ab.toString())){
            return true;
        }
        return false;
    }
}