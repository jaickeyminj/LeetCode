class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size = 0;
        Map<Integer, LinkedList<Integer>> map = new HashMap<>(); 
        for(int i=0; i<nums.size(); i++) {
            List<Integer> numList = nums.get(i);
            for(int j=0; j<numList.size(); j++) {
                int index = i+j;
                LinkedList<Integer> list = map.get(index);
                if(list == null) {
                   list = new LinkedList<>();
                }
                list.addFirst(numList.get(j));
                map.put(index, list);
                size++;
            }
        }

        int maxLen = Collections.max(map.keySet());
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i = 0; i <= maxLen; i++) {
            List<Integer> diagValue = map.get(i);
            resultList.addAll(diagValue);
        }
        
        int[] res = new int[resultList.size()];
        for(int i = 0; i < res.length; i++) {
             res[i] = resultList.get(i); 
        }
         
        return res;   
    }
}