class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
//         HashMap<String,ArrayList<Integer>> hm = new HashMap<>();
//         int ii=0;
//         ArrayList<Integer> list;
//         for(String w: words){
            
//             if(hm.containsKey(w)){
//                 list = hm.get(w);
//             }
//             else{
//                 list = new ArrayList<Integer>();
                
//             }
//             list.add(ii);
//             hm.put(w,list);
//             ii+=1;
//         }
//         if(!hm.containsKey(target))
//             return -1;
//         System.out.println(hm);
//         list = hm.get(target);
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<list.size();i+=1){
//             min = Math.min(min,Math.abs(list.get(i)-startIndex));
//         }
//         return min;
        final int n = words.length;
        int result = 200;
        for (int i = 0; i < n; i++) {
          if (words[i].equals(target)) {
            int distance = Math.abs(startIndex - i);
            result = Math.min(result, Math.min(distance, n - distance));
          }
        }

        return result == 200 ? -1 : result;
    }
}