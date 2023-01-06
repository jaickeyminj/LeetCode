class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i+=1){
            diff = Math.min(diff,arr[i+1]-arr[i]);
        }
        // System.out.println(diff);
        for(int i=0;i<arr.length-1;i+=1){
            if(arr[i+1]-arr[i]==diff){
                List<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[i+1]);
                list.add(new ArrayList<>(l));
            }
        }
        return list;
    }
}