class Solution {
    public int removeDuplicates(int[] A) {
        
        if (A.length<2) return A.length;
        int j=0;
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[j]){
                A[++j]=A[i];
            }
        return ++j;
}
}