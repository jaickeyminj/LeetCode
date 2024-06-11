class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> my_map = new HashMap<>();
        for (int c : arr1){
         if (my_map.containsKey(c)){
            my_map.put(c, my_map.get(c) + 1);
         }else{
            my_map.put(c, 1);
         }
      }
        int res[]= new int[arr1.length];
        int j=0;
        for(int i :arr2){
            while(my_map.get(i)>0){
                res[j]= i;
                j++;
                my_map.put(i,my_map.get(i)-1);
            }
        }
        Arrays.sort(arr1);
        // System.out.println(j);
        if(j<arr1.length){
            // System.out.println(j+1);
            for(int i:arr1){
                if(my_map.containsKey(i) && my_map.get(i)>0){res[j++]=i;                                         my_map.put(i,my_map.get(i)-1);}
            }
        }
        return res;
    }
}