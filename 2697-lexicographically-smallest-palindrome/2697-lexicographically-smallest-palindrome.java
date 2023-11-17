class Solution {
    public String makeSmallestPalindrome(String s) {
        /*int i = 0;
        int j= s.length()-1;
        StringBuilder sb = new StringBuilder();
        char a[] = s.toCharArray();
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                a[i] = a[i];
            }
            else{
                char b = s.charAt(i);
                char c = s.charAt(j);
                if(b>c){
                    a[i] = a[j];
                }
                else{
                    a[j] = a[i];
                }
            }
            i+=1;
            j-=1;
        }
        
        return new String(a);*/
        
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left <= right) {
            if (chars[left] != chars[right]) {
                    chars[left] = chars[right] = (char) Math.min(chars[left], chars[right]);
            }
            left++;
            right--;
        }

        return new String(chars);
    }
}