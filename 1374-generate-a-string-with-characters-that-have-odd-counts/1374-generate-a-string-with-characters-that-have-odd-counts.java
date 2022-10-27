class Solution {
    // public String generateTheString(int n) {
    //     if(n%2!=0){
    //         StringBuilder sb = new StringBuilder();
    //         for(int i=0;i<n;i+=1){
    //             sb.append('c');
    //         }
    //         return sb.toString();
    //     }
    //     StringBuilder sb = new StringBuilder();
    //     int i=1;
    //     sb.append('a');
    //     for(;i<n;i+=1){
    //         sb.append('g');
    //     }
    //     return sb.toString();
    // }
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i+=1){
            sb.append('c');
        }
        if(n%2!=0)
            return sb.toString();
        return sb.toString().substring(1) + "o";
    }
}