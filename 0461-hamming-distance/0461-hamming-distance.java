class Solution {
    public int hammingDistance(int x, int y) {
        String temp = Integer.toString(x^y, 2);
        String temp_a = temp.replaceAll("1","");
        return temp.length() - temp_a.length();
}
}