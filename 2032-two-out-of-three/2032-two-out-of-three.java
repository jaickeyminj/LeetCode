class Solution {
//     public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
//         HashMap<Integer,Set<String>> hm = new HashMap<>();
        
//         for(int i:nums1){
//             hm.putIfAbsent(i,new HashSet<>());
//             hm.get(i).add("One");
//         }
//         for(int i:nums2){
//             hm.putIfAbsent(i,new HashSet<>());
//             hm.get(i).add("Two");
//         }
//         for(int i:nums3){
//             hm.putIfAbsent(i,new HashSet<>());
//             hm.get(i).add("Three");
//         }
        
//         List<Integer> ans = new ArrayList<>();
//         for(Map.Entry<Integer,Set<String>> entry: hm.entrySet()){
//             Set<String> s = entry.getValue();
//             if(s.size()>=2){
//                 ans.add(entry.getKey());
//             }
//         }
//         return ans;
        
//     }
    
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int map[]= new int[101];
        
        for(int i:nums1){
            if(map[i]==0)
                map[i]^=1;
        }
        for(int i:nums2){
            if(map[i]==0 || map[i]==1)
                map[i]^=2;
        }
        for(int i:nums3){
            if(map[i]==0 || map[i]==1 || map[i]==2)
                map[i]^=4;
        }
        List<Integer> ans = new ArrayList<>();
        // int j=0;
        // for(int i:map){
        //     System.out.print((j++)+"="+i+" ");
        // }
        // System.out.println();
        for(int i=1;i<101;i+=1){
            if(map[i]==7 || map[i]==3 || map[i]==6 || map[i]==5){
               ans.add(i); 
            }
        }
        return ans;
    }
}