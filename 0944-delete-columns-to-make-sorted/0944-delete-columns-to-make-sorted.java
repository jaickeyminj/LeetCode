class Solution {
    public int minDeletionSize(String[] strs) {
        final int cols = strs[0].length();
        final int row = strs.length;
        int count =0;
        for(int i=0;i<cols;i+=1){
            // char c = strs[0].charAt(i);
            for(int j=1;j<row;j+=1){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count+=1;
                    break;
                }
                // c = strs[j].charAt(i);
            }
        }
        return count;
    }
}