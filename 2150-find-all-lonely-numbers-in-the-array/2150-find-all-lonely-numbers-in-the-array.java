class Solution {
    public List<Integer> findLonely(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int map[] = new int[1000001];
        for(int i:nums){
            set.add(i);
            map[i]+=1;
        }
        
        for(int i: nums){
            if(set.contains(i-1) || set.contains(i+1)){
                
            }
            else{
                if(map[i]<2)
                    list.add(i);
            }
        }
        
        return list;
    }
}