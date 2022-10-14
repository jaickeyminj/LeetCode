class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Set<String>> hm = new HashMap<>();
        
        for(int i:nums1){
            hm.putIfAbsent(i,new HashSet<>());
            hm.get(i).add("One");
        }
        for(int i:nums2){
            hm.putIfAbsent(i,new HashSet<>());
            hm.get(i).add("Two");
        }
        for(int i:nums3){
            hm.putIfAbsent(i,new HashSet<>());
            hm.get(i).add("Three");
        }
        
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Set<String>> entry: hm.entrySet()){
            Set<String> s = entry.getValue();
            if(s.size()>=2){
                ans.add(entry.getKey());
            }
        }
        return ans;
        
    }
}