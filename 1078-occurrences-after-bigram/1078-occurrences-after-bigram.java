// class Solution {
//     public String[] findOcurrences(String text, String first, String second) {
//         String[] words = text.split("\\s+");
//         List<String> ans = new ArrayList<>();
//         for (int i = 0; i < words.length-2; i+=1) {
//             if (first.equals(words[i]) && second.equals(words[i+1]))
//                 ans.add(words[i+2]);
//         }
//         return ans.toArray(new String[0]);
//     }
// }

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        int isFirst = 0, isSecond=0;
        String[] words = text.split(" ");
        int len = words.length;
        String[] temp = new String[len];
        int ind = 0;
        for(int i=0; i<len; i++){
            if(isFirst>0 && isSecond>0){
                temp[ind++] = words[i];
                isFirst--;isSecond--;
            }
            if(isFirst>0 && words[i].equals(second)){
                isSecond++;
            }else{
                isFirst=0;
            }
            if(words[i].equals(first)){
                isFirst++;
            }
        }
        String[] ans = new String[ind];
        for(int i=0; i<ind; i++) ans[i] = temp[i];
        return ans;
    }
}
