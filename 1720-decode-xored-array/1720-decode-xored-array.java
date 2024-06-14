class Solution {
    public int[] decode(int[] encoded, int first) {
        int ans[] = new int[encoded.length+1];
        // int x=first;
        int j=0;
        ans[j++]=first;
        for(int i: encoded){
            first = i^first;
            ans[j++] = first;
        }
        
        return ans;
    }
}