class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n3=nums.length/3;
        int n= nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> al = new ArrayList<>();
        for(Integer i: map.keySet()){
            if(map.get(i)>n3)
                al.add(i);
        }
        
        return al;
    }
}