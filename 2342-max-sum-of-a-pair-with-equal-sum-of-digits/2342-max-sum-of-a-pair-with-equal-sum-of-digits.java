class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i+=1){
            int key = calculateSum(nums[i]);
            if(map.containsKey(key)){
                List<Integer> al = map.get(key);
                al.add(nums[i]);
                map.put(key,new ArrayList<>(al));
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                map.put(key,list);
            }
        }
        // System.out.println(map);
        PriorityQueue<Map.Entry<Integer,List<Integer>>> pq = new PriorityQueue<>(
        (a,b)-> {
            // if(a.getValue().size()>=2 && b.getValue().size()>=2){
            //     // int sum1 = a.getValue().get(0) + a.getValue().get(1);
            //     // int sum2 = b.getValue().get(0) + b.getValue().get(1);
            //     return b.getValue().size()- a.getValue().size();
            // }
            return b.getValue().size() - a.getValue().size();
        });
        
        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            pq.offer(entry);
        }
        
        // int pair = 2;
        int ans = -1;
        int max = Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            List<Integer> al = pq.poll().getValue();
            if(al.size()==1)
                break;
            else if(al.size()>1){
                int j = Collections.max(al); //max1
                al.remove(al.indexOf(j));
                int max2 = Collections.max(al); //max2
                max = Math.max(j + max2,max); 
                ans=0;
                // break;
            }
        }
        return ans==-1? ans : max;
    }
    
    public int calculateSum(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}