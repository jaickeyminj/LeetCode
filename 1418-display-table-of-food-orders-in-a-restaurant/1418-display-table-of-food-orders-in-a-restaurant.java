class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        List<String> row = new ArrayList<>();
        Set<String> set = new TreeSet<>();
        TreeMap<Integer,HashMap<String,Integer>> map = new TreeMap<>();
        String dish = null;
        Integer table = 0;
        for(List<String> order: orders){
            dish = order.get(2);
            table = Integer.parseInt(order.get(1));
            set.add(dish);
            
            map.putIfAbsent(table,new HashMap<>());
            map.get(table).put(dish,map.get(table).getOrDefault(dish,0)+1);
        }
        row.add("Table");
        row.addAll(set);
        res.add(row);
        List<String> list = null;
        for(Map.Entry<Integer,HashMap<String,Integer>> entry: map.entrySet()){
            list = new ArrayList<>();
            list.add(entry.getKey()+"");
            Map<String,Integer> mp = entry.getValue();
            
            for(String dish2: set){
                if(mp.containsKey(dish2)){
                    list.add(mp.get(dish2)+"");
                }else{
                    list.add(0+"");
                }
                  
            }
            res.add(list);
        }
        
        return res;
    }
}