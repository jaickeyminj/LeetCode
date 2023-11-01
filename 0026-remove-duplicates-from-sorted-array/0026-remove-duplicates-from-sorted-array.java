class Solution {
    public int removeDuplicates(int[] A) {
        
        if (A.length<2) return A.length;
        int j=0;
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[j]){
                A[++j]=A[i];
            }
        return ++j;
        
//         Set<Integer> set = new TreeSet<>();
        
//         for(int i: A){
//             set.add(i);
//         }
//         int i=0;
//         for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
//          Integer f = it.next();
//             A[i++]= f;
//     }
//         return set.size();
}
}